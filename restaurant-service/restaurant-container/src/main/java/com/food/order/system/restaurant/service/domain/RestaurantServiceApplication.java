package com.food.order.system.restaurant.service.domain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(basePackages = {"com.food.order.system.restaurant.service.dataaccess","com.food.order.system.dataaccess"})
@EnableJpaRepositories(basePackages = {"com.food.order.system.restaurant.service.dataaccess","com.food.order.system.dataaccess"})
@SpringBootApplication(scanBasePackages = "com.food.order.system")
public class RestaurantServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestaurantServiceApplication.class, args);
    }
}
