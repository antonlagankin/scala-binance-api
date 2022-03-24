ThisBuild / organization := "io.github.patceev"
ThisBuild / organizationName := "github"
ThisBuild / organizationHomepage := Some(url("https://github.io"))

ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/antonlagankin/scala-binance-api"),
    "scm:git@github.com:antonlagankin/scala-binance-api.git"
  )
)

ThisBuild / developers := List(
  Developer(
    id = "patceev",
    name = "Patceev Andrey",
    email = "patceev@protonmail.com",
    url = url("https://patceev.github.io")
  )
)

ThisBuild / description := "Asynchronous & Easy to use wrapper for Binance API"
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/antonlagankin/scala-binance-api"))

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value) Some("snapshots" at nexus + "content/repositories/snapshots")
  else Some("releases" at nexus + "service/local/staging/deploy/maven2")
}
ThisBuild / publishMavenStyle := true

name := "scala-binance-api"

version := "0.0.2-SNAPSHOT"
organization := "io.github.antonlagankin"

scalaVersion := "2.13.8"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.19",
  "com.typesafe.akka" %% "akka-http" % "10.2.9",
  "com.typesafe.akka" %% "akka-stream" % "2.6.19",
  "io.circe" %% "circe-core" % "0.15.0-M1",
  "io.circe" %% "circe-generic" % "0.15.0-M1",
  "io.circe" %% "circe-parser" % "0.15.0-M1",
  "com.beachape" %% "enumeratum-circe" % "1.7.0",
  "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % Test,
  "com.typesafe" % "config" % "1.3.4"
)
