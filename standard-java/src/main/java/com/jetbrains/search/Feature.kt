package com.jetbrains.search

import com.jetbrains.code.HelperMethods

@Suppress("unused")
class Feature {
    val name = "FeatureName"

    fun getRepresentation() = "{}"

    fun combine() {
        val feature = Feature()
        println(feature.name)
        println(feature.combine())
    }

    fun callJavaMethod() {
        val stringsToPassToJava = listOf(
                "Print", "these",
                "Strings", "please")
        HelperMethods.printAll(stringsToPassToJava)
    }
}
