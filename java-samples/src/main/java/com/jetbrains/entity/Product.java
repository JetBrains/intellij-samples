package com.jetbrains.entity;

import java.math.BigDecimal;
import java.util.List;

public record Product(int id, String title, BigDecimal price, List<OrderItem> orderItemIds) {
}
