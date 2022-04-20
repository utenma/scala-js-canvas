// enable scala.js support
enablePlugins(ScalaJSPlugin)
// this is an application with a main method
scalaJSUseMainModuleInitializer := true

val scala3Version = "3.1.2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "canvas",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
