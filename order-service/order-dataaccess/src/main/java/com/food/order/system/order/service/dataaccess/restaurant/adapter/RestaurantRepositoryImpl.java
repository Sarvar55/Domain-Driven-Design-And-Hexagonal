package com.food.order.system.order.service.dataaccess.restaurant.adapter;

import com.food.order.system.order.service.dataaccess.restaurant.mapper.RestaurantDataAccessMapper;
import com.food.order.system.order.service.dataaccess.restaurant.repository.RestaurantJpaRepository;
import com.food.order.system.order.service.domain.entity.Restaurant;
import com.food.order.system.service.domain.ports.output.repository.RestaurantRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class RestaurantRepositoryImpl implements RestaurantRepository {
    private final RestaurantJpaRepository restaurantJpaRepository;
    private final RestaurantDataAccessMapper restaurantDataAccessMapper;

    public RestaurantRepositoryImpl(RestaurantJpaRepository restaurantJpaRepository, RestaurantDataAccessMapper restaurantDataAccessMapper) {
        this.restaurantJpaRepository = restaurantJpaRepository;
        this.restaurantDataAccessMapper = restaurantDataAccessMapper;
    }

    @Override
    public Optional<Restaurant> findRestaurantInformation(Restaurant restaurant) {
        List<UUID> restaurantProductIds = restaurantDataAccessMapper.restaurantToRestaurantProducts(restaurant);

        return restaurantJpaRepository.findByRestaurantIdAAndProductIdIn(restaurant.getId().getValue(), restaurantProductIds)
                .map(restaurantDataAccessMapper::restaurantEntityToRestaurant);
    }
}
