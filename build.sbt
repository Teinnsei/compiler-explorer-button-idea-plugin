name := "compiler-explorer-idea-plugin"
version := "0.0.2"
scalaVersion := "2.13.8"
resolvers += Resolver.url("jetbrains-sbt", url(s"https://dl.bintray.com/jetbrains/sbt-plugins"))(Resolver.ivyStylePatterns)
idePackagePrefix := Some("com.github.teinnsei.plugin.explorer")
intellijPluginName := "Compiler Explorer Button"
intellijBuild := "221.5080.210"
intellijPlatform := IntelliJPlatform.IdeaCommunity
libraryDependencies ++= Seq("org.scala-lang" % "scala-library" % "2.13.8")
patchPluginXml := pluginXmlOptions { xml =>
  xml.version = version.value
  xml.sinceBuild = "221"
  xml.untilBuild = "221.*"
  xml.pluginDescription = IO.read(baseDirectory.value / "notes" / "pluginDescription.html")
  xml.changeNotes = IO.read(baseDirectory.value / "notes" / "pluginChanges.html")
}
enablePlugins(SbtIdeaPlugin)
