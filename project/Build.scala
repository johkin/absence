import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "absence"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
    		"postgresql" % "postgresql" % "9.1-901-1.jdbc4"
    		"net.liftweb" % "lift-json_2.9.1" % "2.4"
	)

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )
    

}
