package com.food.order.system.service.domain.ports.output.repository;

import com.food.order.system.order.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {

    Optional<Customer> findCustomer(UUID customerId);
}
