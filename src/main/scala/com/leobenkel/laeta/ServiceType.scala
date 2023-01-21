package com.leobenkel.laeta

/**
 * Describe a type of service. Should be extended by
 * {{{
 * case object
 * }}}
 * @tparam A
 *   the service type being described
 */
trait ServiceType[A <: ServiceReady[A]]
