name := "scala-automation-project"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium"%"selenium-java"%"2.53.0",
  "org.seleniumhq.selenium"%"selenium-htmlunit-driver"%"2.52.0",
  "org.scalatest"%"scalatest_2.11"%"2.2.1",
  "info.cukes"%"cucumber-scala_2.11"%"1.2.2",
  "info.cukes"%"cucumber-junit"%"1.2.2",
  "info.cukes"%"cucumber-picocontainer"%"1.2.2",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)