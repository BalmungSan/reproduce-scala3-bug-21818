ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .aggregate(
    tests
  )

lazy val tests = (project in file("tests"))
  .settings(
    scalacOptions ++= Seq(
      "-Wnonunit-statement",
      "-Wconf:any:verbose",
      "-Wconf:name=UnusedNonUnitValue&msg=Assertion:s"
    ),
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19"
  )
