lazy val root = (project in file(".")).
  settings(
    name := "littleprograms",
    version := "0.1",
    scalaVersion := "2.11.7",

    libraryDependencies ++= Seq(
      "org.apache.httpcomponents" % "fluent-hc" % "4.5.1",
      "commons-io" % "commons-io" % "2.4",
      "io.argonaut" %% "argonaut" % "6.0.4",
      "org.scalaz" %% "scalaz-core" % "7.0.6"
    )
  )
