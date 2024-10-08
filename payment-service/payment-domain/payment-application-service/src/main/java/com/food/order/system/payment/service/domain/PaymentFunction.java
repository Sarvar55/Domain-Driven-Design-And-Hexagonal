package com.food.order.system.payment.service.domain;

import com.food.order.system.domain.event.DomainEvent;
import com.food.order.system.domain.event.publisher.DomainEventPublisher;
import com.food.order.system.payment.service.domain.entity.CreditEntry;
import com.food.order.system.payment.service.domain.entity.CreditHistory;
import com.food.order.system.payment.service.domain.entity.Payment;
import com.food.order.system.payment.service.domain.event.PaymentEvent;

import java.util.List;

@FunctionalInterface
public interface PaymentFunction<T extends PaymentEvent> {

    T apply(Payment payment, CreditEntry creditEntry,
            List<CreditHistory> creditHistories, List<String> failureMessages,
            DomainEventPublisher<T> eventPublisher,
            DomainEventPublisher<T> failEventPublisher);
}
