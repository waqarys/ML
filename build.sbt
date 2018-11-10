name := "projects"

version := "0.1"

scalaVersion := "2.11.7"

libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze" % "0.13.2",
  "org.scalanlp" %% "breeze-natives" % "0.13.2",
  "org.scalanlp" %% "breeze-viz" % "0.13.2",
  "com.quantifind" %% "wisp" % "latest.integration"

)

resolvers += "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
//resolvers += "Maven Releases" at "https://mvnrepository.com/artifact/"
//resolvers := Seq(
//  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots",
//  "Typesafe backup repo" at "http://repo.typesafe.com/typesafe/repo/",
//  "Maven repo1" at "https://repo1.maven.org/maven2/",
//  "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
//  "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
//)