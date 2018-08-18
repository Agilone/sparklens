name := "sparklens"
organization := "com.qubole"
version := "0.1.0"

scalaVersion := "2.10.5"


libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0-cdh5.12.2"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

resolvers += "cloudera" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
