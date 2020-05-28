package com.leobenkel.laeta

// Registery of services ready to use
case class ServiceCollection(services: Map[ServiceType[_], ServiceBuilt[_]]) {
  final def getService[A <: ServiceReady[A]](t: ServiceType[A]): Option[A] =
    services.get(t).map(_.get[A])
}
