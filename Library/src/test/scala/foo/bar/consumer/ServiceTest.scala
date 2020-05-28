package foo.bar.consumer

import com.leobenkel.laeta._
import org.scalatest.FreeSpec

class ServiceTest extends FreeSpec {
  "Service Example" - {
    "Registering and using services" in {
      val aInput: Int = 456
      val bInput: String = "abc"

      val registryBuilder: RegistryFactories = RegistryFactories()
        .register(Services.ServiceAMaker(aInput))
        .register(Services.ServiceBMaker(bInput))

      val registryReady: ServiceCollection = registryBuilder.create

      val serviceA = registryReady.getService(Services.ServiceAGet)
      val serviceB = registryReady.getService(Services.ServiceBGet)
      val serviceC = registryReady.getService(Services.ServiceCGet)

      assertResult(Some(aInput.toDouble))(serviceA.map(_.test))
      assertResult(Some(bInput))(serviceB.map(_.foo))
      assertResult(None)(serviceC.map(_.bar()))
    }
  }
}

object Services {
  // First Service
  case class ServiceAImpl(override val input: Int) extends Service[Int, ServiceAImpl] {
    val test: Double = input.toDouble
  }
  object ServiceAImpl extends ServiceConstructor[Int, ServiceAImpl] {}
  case object ServiceAGet extends ServiceType[ServiceAImpl] {}
  case class ServiceAMaker(override val getInput: Int) extends ServiceFactory[Int, ServiceAImpl] {
    lazy override protected val getObject: ServiceConstructor[Int, ServiceAImpl] = ServiceAImpl
    lazy override protected val getType:   ServiceType[ServiceAImpl] = ServiceAGet
  }

  // Second service
  case class ServiceBImpl(override val input: String) extends Service[String, ServiceBImpl] {
    val foo: String = input
  }
  object ServiceBImpl extends ServiceConstructor[String, ServiceBImpl] {}
  case object ServiceBGet extends ServiceType[ServiceBImpl] {}
  case class ServiceBMaker(override val getInput: String)
      extends ServiceFactory[String, ServiceBImpl] {
    lazy override protected val getObject: ServiceConstructor[String, ServiceBImpl] =
      ServiceBImpl
    lazy override protected val getType: ServiceType[ServiceBImpl] = ServiceBGet
  }

  // Third service
  case class ServiceCImpl() extends Service[Unit, ServiceCImpl] {
    lazy override protected val input: Unit = ()

    def bar(): Int = ???
  }
  case object ServiceCImpl extends ServiceConstructor[Unit, ServiceCImpl] {
    def apply(i: Unit): ServiceCImpl = ServiceCImpl()
  }
  case object ServiceCGet extends ServiceType[ServiceCImpl] {}
  case object ServiceCMaker extends ServiceFactory[Unit, ServiceCImpl] {
    lazy override protected val getInput: Unit = ()
    lazy override protected val getObject: ServiceConstructor[Unit, ServiceCImpl] =
      ServiceCImpl
    lazy override protected val getType: ServiceType[ServiceCImpl] = ServiceCGet
  }
}
