val projectName = IO.readLines(new File("PROJECT_NAME")).head
val v = IO.readLines(new File("VERSION")).head

val scala11 = "2.11.12"
val scala12 = "2.12.15"

lazy val rootSettings = Seq(
  organization := "com.leobenkel",
  homepage     := Some(url("https://github.com/leobenkel/Laeta")),
  licenses     := List("MIT" -> url("https://opensource.org/licenses/MIT")),
  developers := List(
    Developer(
      "leobenkel",
      "Leo Benkel",
      "",
      url("https://leobenkel.com")
    )
  ),
  scalaVersion       := scala11,
  crossScalaVersions := Seq(scala11, scala12),
  soteriaAddSemantic := false
)

lazy val commonSettings = rootSettings ++ Seq(
  libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "3.2.3" % Test
  ),
  updateOptions           := updateOptions.value.withGigahorse(false),
  publishArtifact in Test := false,
  pomIncludeRepository    := (_ => false)
)

lazy val root = (project in file("."))
  .aggregate(library)
  .settings(
    name := s"$projectName-$v",
    rootSettings
  )

lazy val library = (project in file("Library"))
  .settings(
    commonSettings,
    name := projectName
  )
