name := "pb-scala"
version := "0.3"
scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.nscala-time" %% "nscala-time" % "2.16.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "jline" % "jline" % "2.14.3"
)

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
homepage := Some(url("https://github.com/matfax/pb-scala"))
