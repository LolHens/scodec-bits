resolvers += "Sonatype Public" at "https://oss.sonatype.org/content/groups/public/"

addSbtPlugin("org.scodec" % "scodec-build" % "1.9.0")

addSbtPlugin("org.scala-js"       % "sbt-scalajs"              % "0.6.22")
addSbtPlugin("org.portable-scala" % "sbt-crossproject"         % "0.3.0")
addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "0.3.0")
addSbtPlugin("org.scala-native"   % "sbt-scala-native"         % "0.3.6")
