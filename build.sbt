name := "gitpack-scala-simple"

organization := "com.github.takumakei"

version := "0.0.1"

scalaVersion := "2.11.6"

scalacOptions in ThisBuild ++= Seq(
  "-deprecation",
  "-feature",
  "-unchecked",
  "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfatal-warnings"
)

crossScalaVersions := Seq("2.10.5", "2.11.6")
