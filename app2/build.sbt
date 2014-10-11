name := """play-multi-project-app-2"""

// Version for this and all sub-modules
version in ThisBuild := "1.1-SNAPSHOT"

// sbt-web
pipelineStages := Seq(digest, gzip)

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node
