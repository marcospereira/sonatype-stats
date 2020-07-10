scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-stream" % "2.6.7",
  "com.typesafe.akka" %% "akka-http-core" % "10.1.12",
  "com.lightbend.akka" %% "akka-stream-alpakka-csv" % "2.0.1",
)

scalafmtOnCompile := true
