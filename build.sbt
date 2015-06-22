name := "Spark Model Variable"

organization := "org.tresamigos"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.4"

val sparkVersion = "1.1.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql"  % sparkVersion % "provided",
  "org.scalatest" %% "scalatest" % "2.2.0" % "test",
  "org.rogach" %% "scallop" % "0.9.5",
  "org.joda" % "joda-convert" % "1.7",
  "joda-time" % "joda-time" % "2.7",
  "com.rockymadden.stringmetric" %% "stringmetric-core" % "0.27.2"
)

parallelExecution in Test := false
