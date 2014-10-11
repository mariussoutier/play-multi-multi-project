name := "play-multi-project-root"

organization in ThisBuild := "com.mariussoutier.example"

scalaVersion in ThisBuild := "2.10.4"

lazy val root = project.in(file("."))
  .dependsOn(app1, app2)
  .aggregate(app1, app2)

// This is common, non-Play code
lazy val model = project

// app1 is configured in its own build.sbt file
lazy val app1 = project

// app2 is configured here on the top level
// this is preferable when all projects are configured the same way
// Exposing all sub-modules might be too verbose, though
lazy val admin2 = project.in(file("app2/modules/admin2"))
  .enablePlugins(PlayScala)
  .dependsOn(model)

lazy val app2 = project
  .enablePlugins(PlayScala)
  .aggregate(model, admin2)
  .dependsOn(model, admin2)
