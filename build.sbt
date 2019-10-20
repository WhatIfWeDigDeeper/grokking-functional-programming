lazy val root = (project in file("."))
  .settings(
    name := "grokkingfp-examples",
    organization := "Michał Płachta (Manning)",
    version := "1.0",
    scalaVersion := "2.12.8",
    scalacOptions ++= List(
      "-unchecked",
      "-Ywarn-unused-import",
      "-Xfatal-warnings",
      "-Ypartial-unification",
      "-language:higherKinds",
      "-Xlint"
    ),
    fork in run := true,
    javaOptions in run += "-ea",
    compile in Compile := (compile in Compile).dependsOn(scalafmt in Compile).dependsOn(scalafmtSbt in Compile).value,
    addCommandAlias(
      "runAll",
      ";runMain Intro" +
      ";runMain TestingPureFunctions" +
      ";runMain PureFunctions" +
      ";runMain ShoppingCartDiscounts" +
      ";runMain DeletingMutability" +
      ";runMain TipCalculation" +
      ";runMain ShoppingCartDiscountsScala" +
      ";runMain TipCalculationScala" +
      ";runMain Restaurant" +
      ";runMain BookAdaptations" +
      ";runMain BookFriendRecommendations" +
      ";runMain Points2d3d" +
      ";runMain PointsInsideCircles" +
      ";runMain SequencedNestedFlatMaps" +
      ";runMain Events" +
      ";runMain RandomForComprehensions"
    )
  )
