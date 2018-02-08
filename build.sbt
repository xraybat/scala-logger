name := "logger"

version := "1.0-SNAPSHOT"

scalaVersion := "2.12.4"

logBuffered in Test := false

scalacOptions ++= Seq("-unchecked", "-deprecation")

//resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.7.2",
  // see https://github.com/typesafehub/scalalogging/issues/26
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.25",  // for any java classes looking for this
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.scalactic" %% "scalactic" % "3.0.4",
  "org.scalatest" %% "scalatest" % "3.0.4" % "test"
)