@file:Suppress("unused")

package com.jetbrains.code

import com.jetbrains.entity.Order
import java.time.LocalDateTime

// Use Alt+Enter and select "Put parameters on separate lines"
data class ManyParameters(val firstName: String, val id: Int, val lastName: String, val orders: List<Order>) {

    fun formatOrders(sellerId: Int, fromDate: LocalDateTime, toDate: LocalDateTime, handler: (Order) -> String) {
        println("sellerId = [${sellerId}], fromDate = [${fromDate}], toDate = [${toDate}], handler = [${handler}]")
        // TODO: format all the orders
    }
}
