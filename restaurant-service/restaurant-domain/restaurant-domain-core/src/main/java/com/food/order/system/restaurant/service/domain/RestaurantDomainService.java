package com.food.order.system.restaurant.service.domain;

import com.food.order.system.domain.event.publisher.DomainEventPublisher;
import com.food.order.system.restaurant.service.domain.entity.Restaurant;
import com.food.order.system.restaurant.service.domain.event.OrderApprovalEvent;
import com.food.order.system.restaurant.service.domain.event.OrderApprovedEvent;
import com.food.order.system.restaurant.service.domain.event.OrderRejectedEvent;

import java.util.List;

public interface RestaurantDomainService {
    OrderApprovalEvent validateOrder(Restaurant restaurant,
                                     List<String> failureMessages,
                                     DomainEventPublisher<OrderApprovedEvent> approvedEventDomainEventPublisher,
                                     DomainEventPublisher<OrderRejectedEvent> orderRejectedEventDomainEventPublisher);
}
