import org.scalajs.linker.interface.ModuleSplitStyle

val scala3Version = "3.2.0"

lazy val root = project
  .in(file("."))
  // enable scala.js support
  .enablePlugins(ScalaJSPlugin)
  .settings(
    // name := "canvas",
    // version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    // scala compiler flags
    scalacOptions ++= Seq("-encoding", "utf-8", "-deprecation", "-feature"),
    // use a `main` method
    scalaJSUseMainModuleInitializer := true,
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.ESModule)
        .withModuleSplitStyle(ModuleSplitStyle.SmallModulesFor(List("root")))
    },
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "2.3.0",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    ),
  )
