scalaVersion := "3.3.4"

scalacOptions ++= Seq(
  "-Wnonunit-statement",
  "-Wconf:any:verbose",
  "-Wconf:name=UnusedNonUnitValue&msg=Int:s"
)
