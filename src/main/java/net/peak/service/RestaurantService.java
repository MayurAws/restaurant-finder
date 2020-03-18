package net.peak.service;

import net.peak.data.Restaurant;
import net.peak.repository.RestaurantRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    RestaurantRepository restaurantRepository;

    public RestaurantService(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public List<Restaurant> getRestaurantDetails(String areaName, String cuisine, String grade) {

        List<Integer> restaurantList =
                restaurantRepository.findByRestaurantRatings(areaName, cuisine, grade);

        List<Restaurant> restaurants = new ArrayList<>();

        restaurantList.stream().parallel().forEach(restaurant -> {
            restaurants.add(restaurantRepository.findByCamis(restaurant));
        });

        return restaurants;
    }
}
