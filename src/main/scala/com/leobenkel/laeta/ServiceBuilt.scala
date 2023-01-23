package com.leobenkel.laeta

/**
 * Once the service is built and packaged, ready to use.
 * @param serviceType
 *   the type of service this is
 * @param service
 *   the service itself
 * @tparam A
 *   the type of service
 */
private[laeta] case class ServiceBuilt[A <: ServiceReady[A]](
    serviceType: ServiceType[A],
    service:     ServiceReady[A]
) {
  final def get[B <: ServiceReady[B]]: B = this.service.asInstanceOf[B]

  lazy final val keyed: (ServiceType[A], ServiceBuilt[A]) = serviceType -> this
}
