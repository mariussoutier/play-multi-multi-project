name := """play-multi-project-app-1"""

// Version for this and all sub-modules
version in ThisBuild := "1.0-SNAPSHOT"

// Defines the project and its dependencies here instead of root build.sbt

lazy val app1 = (project in file("."))
  .enablePlugins(PlayScala)
  .dependsOn(model, admin1)

// Plugins must be enabled seperatly for sub-modules
lazy val admin1 = project.in(file("modules/admin"))
  .enablePlugins(PlayScala)
  .dependsOn(model)

lazy val model = project.in(file("../model"))

// sbt-web
pipelineStages := Seq(digest, gzip)

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node
