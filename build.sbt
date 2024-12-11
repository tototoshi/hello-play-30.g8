val _scalaVersion = "3.6.2"

lazy val `hello-play-30` = project
  .in(file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "hello-play-30",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := _scalaVersion,
    libraryDependencies ++= Seq(
      guice,
      "org.scalatest" %% "scalatest" % "3.2.19" % "test"
    )
  )
