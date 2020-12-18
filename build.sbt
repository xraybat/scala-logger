name := "logger"

version := "1.0-SNAPSHOT"

scalaVersion := "2.13.1"

logBuffered in Test := false

scalacOptions ++= Seq("-unchecked", "-deprecation")

//resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2",
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "org.slf4j" % "log4j-over-slf4j" % "1.7.30",
  "org.scalatest" % "scalatest_2.13" % "3.0.8" % "test"
  //"org.scalactic" %% "scalactic" % "3.0.4",
)
