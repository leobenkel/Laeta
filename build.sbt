scalaVersion := "2.13.11"

organization := "com.leobenkel"
homepage     := Some(url("https://github.com/leobenkel/Laeta"))
licenses     := List("MIT" -> url("https://opensource.org/licenses/MIT"))
developers   :=
  List(
    Developer(
      "leobenkel",
      "Leo Benkel",
      "",
      url("https://leobenkel.com")
    )
  )

sonatypeCredentialHost := "oss.sonatype.org"
sonatypeRepository     := "https://oss.sonatype.org/service/local"
name                   := "laeta"

publishMavenStyle := true

// fail to publish without that
updateOptions := updateOptions.value.withGigahorse(false)

Test / publishArtifact := false

pomIncludeRepository := (_ => false)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test

publishArtifact in Test := false
pomIncludeRepository    := (_ => false)
