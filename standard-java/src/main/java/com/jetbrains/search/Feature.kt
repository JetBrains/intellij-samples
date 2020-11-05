package com.jetbrains.search

@Suppress("unused")
class Feature {
   val name = "FeatureName"

   fun getRepresentation() = "{}"

   fun combine() {
       val feature = Feature()
       println(feature.name)
       println(feature.combine())
   }
}
