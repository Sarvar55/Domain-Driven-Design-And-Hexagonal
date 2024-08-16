package com.food.order.system.service.domain;

import com.food.order.system.order.service.domain.event.OrderCreatedEvent;
import com.food.order.system.service.domain.ports.output.message.publisher.payment.OrderCreatedPaymentRequestMassagePublisher;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class OrderCreatedEventApplicationListener {

    private final OrderCreatedPaymentRequestMassagePublisher orderCreatedPaymentRequestMassagePublisher;

    public OrderCreatedEventApplicationListener(OrderCreatedPaymentRequestMassagePublisher orderCreatedPaymentRequestMassagePublisher) {
        this.orderCreatedPaymentRequestMassagePublisher = orderCreatedPaymentRequestMassagePublisher;
    }

    @TransactionalEventListener
    void process(OrderCreatedEvent orderCreatedEvent) {
        orderCreatedPaymentRequestMassagePublisher.publish(orderCreatedEvent);
    }
}
