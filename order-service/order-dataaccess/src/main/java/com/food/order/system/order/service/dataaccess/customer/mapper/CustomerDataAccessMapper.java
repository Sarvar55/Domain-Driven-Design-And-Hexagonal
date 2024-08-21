package com.food.order.system.order.service.dataaccess.customer.mapper;

import com.food.order.system.domain.valueobject.CustomerId;
import com.food.order.system.order.service.dataaccess.customer.entity.CustomerEntity;
import com.food.order.system.order.service.domain.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataAccessMapper {

    public Customer customerEntityToCustomer(CustomerEntity customerEntity) {
        return new Customer(new CustomerId(customerEntity.getId()));
    }

}
