package com.leobenkel.laeta

/**
  * Main entry point to the library.
  * @param serviceMakers collection of makers
  */
case class RegistryFactories(private val serviceMakers: List[ServiceFactory[_, _]] = Nil) {

  /**
    * Add a potential service to the registry of builders
    */
  final def register[INPUT, A <: Service[INPUT, A]](
    serviceMaker: ServiceFactory[INPUT, A]
  ): RegistryFactories =
    this.copy(serviceMakers = this.serviceMakers :+ serviceMaker)

  /**
    * make the services real
    */
  lazy private val built: Seq[ServiceBuilt[_]] = serviceMakers.map(_.build)

  /**
    * turn the ready services into a map
    */
  lazy private val builtMap: Map[ServiceType[_], ServiceBuilt[_]] = built.map(_.keyed).toMap

  lazy val create: ServiceCollection = ServiceCollection(builtMap)
}
