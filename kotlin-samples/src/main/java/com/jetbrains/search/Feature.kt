package com.jetbrains.search

import com.jetbrains.code.HelperMethods

@Suppress("unused")
class Feature {
    private val name = "FeatureName"

    fun getRepresentation() = "{}"

    private fun combine() {
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
