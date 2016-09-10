package com.jetbrains.refactoring

import java.util.*


class Java8 {


    private val rateProvider = RateProvider.getInstance()

    private fun convert(amounts: List<Double>, src: String, dest: String): List<Double> {
        val result = ArrayList<Double>()
        for (amount in amounts) {
            result.add(amount * rateProvider.getRate(src, dest))
        }
        return result

    }

    fun print(amounts: List<Double>, src: String, dest: String, threshold: Double) {
        for (amount in convert(amounts, src, dest)) {
            if ((amount < threshold)) {
                System.out.println(amount)
            }
        }
    }
}

