package com.leobenkel.laeta

/**
  * The service when it is ready to use, after being built
  * @tparam A itself
  */
private[laeta] trait ServiceReady[A <: ServiceReady[A]]

/**
  * This implementation of the service
  * @tparam INPUT input that needs to create it
  * @tparam A itself
  */
trait Service[INPUT, A <: ServiceReady[A]] extends ServiceReady[A] {
  protected def input: INPUT
}
