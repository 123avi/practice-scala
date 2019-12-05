import Dependencies._

ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-practice",
    libraryDependencies += scalaTest % Test,
    libraryDependencies += "org.apache.directory.studio" % "org.apache.commons.io" % "2.4",
    libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.5.10",
    libraryDependencies += "net.liftweb" %% "lift-json" % "3.4.0"




  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
