ThisBuild / scalaVersion := "3.3.4"

// Common settings.
lazy val commonSettings = Def.settings(
  // Ensure we publish an artifact linked to the appropriate Java std library.
  scalacOptions ++= Seq(
    "-release:17",
    // Make all warnings verbose.
    // Scala 3 doesn't support multiple -Wconf settings.
    // Thus, this one is commented to enable the test ones.
    "-Wconf:any:verbose"
  )
)

lazy val root = (project in file("."))
  .aggregate(
    tests
  )

lazy val tests = (project in file("tests"))
  .settings(commonSettings)
  .settings(
    scalacOptions ++= Seq(
      "-Yretain-trees",
      "-Wconf:name=UnusedNonUnitValue&msg=Assertion:s"
    ),
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19",
    Test / fork := true,
    Test / parallelExecution := false,
    Test / testOptions += Tests.Argument("-oFIK")
  )
