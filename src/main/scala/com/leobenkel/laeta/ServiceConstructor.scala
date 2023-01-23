package com.leobenkel.laeta

/**
 * To build a service
 * @tparam INPUT
 *   input argument to construct
 * @tparam A
 *   service itself
 */
trait ServiceConstructor[INPUT, A <: Service[INPUT, A]] {
  def apply(input: INPUT): ServiceReady[A]
}
