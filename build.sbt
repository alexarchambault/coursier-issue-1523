scalaVersion := "2.12.11"
libraryDependencies ++= Seq(
  "com.github.alexarchambault" %% "argonaut-shapeless_6.2" % "1.2.0",
  "com.chuusai" %% "shapeless" % "2.3.2"
)
versionReconciliation += "com.chuusai" %% "shapeless" % "strict"

// if commented out: conflict
// when forcing 2.3.2 or 2.3.3: no conflict
dependencyOverrides += "com.chuusai" %% "shapeless" % "2.3.3"
