lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.8",
      version      := "0.1"
    )),
    name := "specs2-html-report-sample",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-html" % "4.14.1" % "test"
    ),
    testOptions in Test += Tests.Argument(TestFrameworks.Specs2,  "console", "html", "!pandoc", "html.outdir", "target/generated/test-reports")
  )
