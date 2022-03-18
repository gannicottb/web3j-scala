// Settings for sbt assembly

assembly / test := {}

assembly / mainClass := Some("org.web3j.console.Runner")

assembly / assemblyMergeStrategy := {
 case PathList("META-INF", xs @ _*) => MergeStrategy.discard
 case x => MergeStrategy.first
}
