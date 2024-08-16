package com.food.order.system.order.service.domain.event;

import com.food.order.system.domain.event.DomainEvent;
import com.food.order.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCreatedEvent  extends OrderEvent{

    public OrderCreatedEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
