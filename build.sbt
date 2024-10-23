scalaVersion := "3.3.4"

scalacOptions ++= Seq(
  "-Wnonunit-statement",
  "-Wconf:any:verbose",
  "-Wconf:name=UnusedNonUnitValue&msg=Assertion:s"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.19"
