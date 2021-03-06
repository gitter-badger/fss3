name := "fss3"

version := "1.0"

scalaVersion := "2.11.7"
    
resolvers += Resolver.sonatypeRepo("snapshots")
    
val finchV = "0.9.1"

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % finchV changing(),
  "com.github.finagle" %% "finch-test" % finchV changing(),
  "com.github.finagle" %% "finch-circe" % finchV changing(),
  "org.scala-lang.modules" %% "scala-pickling" % "0.10.1",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.4",
  "com.typesafe" % "config" % "1.3.0",
  // "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test",
  "commons-io" % "commons-io" % "2.4",
  "commons-codec" % "commons-codec" % "1.10",
  // "org.apache.httpcomponents" % "httpclient" % "4.5",
  // "org.apache.httpcomponents" % "httpmime" % "4.5.1",
  "org.apache.tika" % "tika-core" % "1.10",
  // "com.google.guava" % "guava" % "18.0",
  // "com.amazonaws" % "aws-java-sdk" % "1.10.12",
  "com.typesafe.slick" %% "slick" % "3.0.2",
  "org.xerial" % "sqlite-jdbc" % "3.7.2"
  // "com.github.scopt" %% "scopt" % "3.3.0",
  // "ch.qos.logback" % "logback-classic" % "1.1.2"
)
