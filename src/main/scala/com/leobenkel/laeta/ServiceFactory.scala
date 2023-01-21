package com.leobenkel.laeta

/**
 * The service factory
 * @tparam INPUT
 *   argument needed to make the service
 * @tparam A
 *   the service
 */
trait ServiceFactory[INPUT, A <: Service[INPUT, A]] {
  protected def getObject: ServiceConstructor[INPUT, A]
  protected def getType:   ServiceType[A]
  protected def getInput:  INPUT

  final def build: ServiceBuilt[A] =
    ServiceBuilt(
      serviceType = getType,
      service = getObject.apply(getInput)
    )
}
