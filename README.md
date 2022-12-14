[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Gitter](https://badges.gitter.im/laeta/community.svg)](https://gitter.im/laeta/community?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge)
[![release-badge][]][release]
[![maven-central-badge][]][maven-search]
[![CI-CD](https://github.com/leobenkel/Laeta/actions/workflows/ci_cd.yml/badge.svg)](https://github.com/leobenkel/Laeta/actions/workflows/ci_cd.yml)
[![BCH compliance](https://bettercodehub.com/edge/badge/leobenkel/Laeta?branch=master)](https://bettercodehub.com/)
[![Coverage Status](https://coveralls.io/repos/github/leobenkel/Laeta/badge.svg?branch=master)](https://coveralls.io/github/leobenkel/laeta?branch=master)
[![Mutation testing badge](https://badge.stryker-mutator.io/github.com/leobenkel/Laeta/master)](https://stryker-mutator.github.io)

[release]:              https://github.com/leobenkel/laeta/releases
[release-badge]:        https://img.shields.io/github/tag/leobenkel/laeta.svg?label=version&color=blue
[maven-search]:         https://search.maven.org/search?q=g:com.leobenkel%20a:laeta*
[leobenkel-github-badge]:     https://img.shields.io/badge/-Github-yellowgreen.svg?style=social&logo=GitHub&logoColor=black
[leobenkel-github-link]:      https://github.com/leobenkel
[leobenkel-linkedin-badge]:     https://img.shields.io/badge/-Linkedin-yellowgreen.svg?style=social&logo=LinkedIn&logoColor=black
[leobenkel-linkedin-link]:      https://linkedin.com/in/leobenkel
[leobenkel-personal-badge]:     https://img.shields.io/badge/-Website-yellowgreen.svg?style=social&logo=data:image/svg+xml;base64,PHN2ZyBoZWlnaHQ9JzMwMHB4JyB3aWR0aD0nMzAwcHgnICBmaWxsPSIjMDAwMDAwIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciIHhtbG5zOnhsaW5rPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5L3hsaW5rIiB2ZXJzaW9uPSIxLjEiIHg9IjBweCIgeT0iMHB4IiB2aWV3Qm94PSIwIDAgNjQgNjQiIGVuYWJsZS1iYWNrZ3JvdW5kPSJuZXcgMCAwIDY0IDY0IiB4bWw6c3BhY2U9InByZXNlcnZlIj48Zz48Zz48cGF0aCBkPSJNNDEuNiwyNy4yYy04LjMsMC0xNSw2LjctMTUsMTVzNi43LDE1LDE1LDE1YzguMywwLDE1LTYuNywxNS0xNVM0OS45LDI3LjIsNDEuNiwyNy4yeiBNNTEuNSwzNmgtMy4zICAgIGMtMC42LTEuNy0xLjQtMy4zLTIuNC00LjZDNDguMiwzMi4yLDUwLjIsMzMuOSw1MS41LDM2eiBNNDEuNiwzMS41YzEuMywxLjIsMi4zLDIuNywzLDQuNGgtNkMzOS4zLDM0LjIsNDAuNCwzMi43LDQxLjYsMzEuNXogICAgIE0zNy40LDMxLjNjLTEsMS40LTEuOCwyLjktMi40LDQuNmgtMy4zQzMzLjEsMzMuOSwzNS4xLDMyLjIsMzcuNCwzMS4zeiBNMzAuMyw0NWMtMC4yLTAuOS0wLjQtMS44LTAuNC0yLjhjMC0xLDAuMS0yLDAuNC0yLjkgICAgaDMuOWMtMC4xLDEtMC4yLDEuOS0wLjIsMi45YzAsMC45LDAuMSwxLjksMC4yLDIuOEgzMC4zeiBNMzEuNyw0OC4zSDM1YzAuNiwxLjcsMS40LDMuNCwyLjQsNC44QzM1LDUyLjIsMzMsNTAuNSwzMS43LDQ4LjN6ICAgICBNNDEuNiw1Mi45Yy0xLjMtMS4yLTIuMy0yLjgtMy4xLTQuNWg2LjFDNDQsNTAuMSw0Mi45LDUxLjcsNDEuNiw1Mi45eiBNMzcuNiw0NWMtMC4yLTAuOS0wLjItMS44LTAuMi0yLjhjMC0xLDAuMS0yLDAuMy0yLjloOCAgICBjMC4yLDAuOSwwLjMsMS45LDAuMywyLjljMCwxLTAuMSwxLjktMC4yLDIuOEgzNy42eiBNNDUuOCw1My4xYzEtMS40LDEuOC0zLDIuNC00LjhoMy4zQzUwLjIsNTAuNSw0OC4yLDUyLjIsNDUuOCw1My4xeiBNNDksNDUgICAgYzAuMS0wLjksMC4yLTEuOCwwLjItMi44YzAtMS0wLjEtMi0wLjItMi45aDMuOWMwLjIsMC45LDAuNCwxLjksMC40LDIuOWMwLDEtMC4xLDEuOS0wLjQsMi44SDQ5eiI+PC9wYXRoPjxwYXRoIGQ9Ik0zNCwyNS45Yy0wLjktMC43LTEuOC0xLjMtMi45LTEuOGMyLTIuMSwzLjItNC45LDMuMi03LjljMC02LjMtNS4xLTExLjQtMTEuNC0xMS40UzExLjYsOS45LDExLjYsMTYuMiAgICBjMCwzLjEsMS4yLDUuOSwzLjIsNy45Yy00LjEsMi02LjgsNS40LTcuMSw5LjRsLTAuMywzLjhjMCwyLDcsMy42LDE1LjYsMy42YzAuMiwwLDAuNSwwLDAuNywwQzI0LjIsMzQuMywyOC4yLDI4LjYsMzQsMjUuOXogICAgIE0yMyw4LjhjNC4xLDAsNy40LDMuMyw3LjQsNy40cy0zLjMsNy40LTcuNCw3LjRzLTcuNC0zLjMtNy40LTcuNFMxOC45LDguOCwyMyw4Ljh6Ij48L3BhdGg+PC9nPjwvZz48L3N2Zz4=&logoColor=black
[leobenkel-personal-link]:      https://leobenkel.com
[leobenkel-patreon-link]:            https://www.patreon.com/leobenkel
[leobenkel-patreon-badge]: https://img.shields.io/badge/-Patreon-yellowgreen.svg?style=social&logo=Patreon&logoColor=black
[maven-central-link]:           https://maven-badges.herokuapp.com/maven-central/com.leobenkel/laeta_2.11
[maven-central-badge]:          https://maven-badges.herokuapp.com/maven-central/com.leobenkel/laeta_2.11/badge.svg


# Laeta

Small library to handle registery of services.

Handle collection of Services of arbitrary type and retrieve them fully typed.

[Laeta (wikipedia)](https://en.wikipedia.org/wiki/Laetitia_(goddess))

## Table of Contents

* [How to use?](#how-to-use)
  * [Add to build.sbt](#add-to-buildsbt)
  * [Setup](#setup)
  * [To use](#to-use)
  * [Notes](#notes)

Created by [gh-md-toc](https://github.com/ekalinin/github-markdown-toc)

## How to use?

### Add to build.sbt

First include the library in your project:

```sbt
libraryDependencies += "com.leobenkel" %% "laeta" % "[VERSION]"
```
With version being: [![maven-central-badge][]][maven-search]

### Setup

Live example: [Scastie-0P5GodpCSSmL5Pd8igL0tA](https://scastie.scala-lang.org/0P5GodpCSSmL5Pd8igL0tA) or take a look at the [test example](https://github.com/leobenkel/Laeta/blob/master/Library/src/test/scala/foo/bar/consumer/ServiceTest.scala)

You need two pieces for the compiler to start guiding you:

A service:
```scala
import com.leobenkel.laeta.Service

case class MyService(override val input: INPUT) extends Service[INPUT, MyService] {
 ???
}
```

And a factory:

```scala
import com.leobenkel.laeta.ServiceFactory

case class MyFactory(override val getInput: Int) extends ServiceFactory[INPUT, MyService] {
    lazy override protected val getObject: ServiceConstructor[INPUT, MyService] = MyConstructor
    lazy override protected val getType:   ServiceType[MyService] = MyGeyKey
}
```

This will force you to create:

A constructor:

```scala
object MyConstructor extends ServiceConstructor[INPUT, MyService]
```

Your `MyConstructor` should probably have the same name as `case class MyService` so you don't have to implement the `apply` method.

and a Type:

```scala
case object MyGeyKey extends ServiceType[MyService] {}
```

### To use

And to use is very simple, you first register all the factories:

```scala
val registryBuilder: RegistryFactories = RegistryFactories()
    .register(MyFactory(input))
```

and then you seal the registry:

```scala
val registryReady: ServiceCollection = registryBuilder.create
```

you can now access any service, anywhere, **typed** !

```scala
val myService = registryReady.getService(MyGeyKey)
```

### Notes

It is possible to merge the `ServiceConstructor[INPUT, MyService]` and the `ServiceType[MyService]` for shorter code.

This mean you can replace all the places where we used `MyGeyKey` by `MyConstructor`. 

Example on [Scastie-716dNpMORwuJqO9RWED93A](https://scastie.scala-lang.org/716dNpMORwuJqO9RWED93A).
