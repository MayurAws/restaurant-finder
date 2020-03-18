package net.peak.controller;

import io.swagger.annotations.ApiOperation;
import net.peak.data.Restaurant;
import net.peak.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sample-api")
public class FoodQualityAssessorController {

    private RestaurantService restaurantService;

    public FoodQualityAssessorController(RestaurantService restaurantService) {
        this.restaurantService = restaurantService;
    }

    /**
     * Returns the list of restaurants based on the user filter criteria
     * @param areaName Area in which restaurants are being located
     * @param cuisine Type of cuisines
     * @param rating Customer Rating
     * @return
     */
    @GetMapping("/area/{areaName}/{cuisine}/{rating}")
    @ApiOperation(value = "Searches for list of restaurants by given filters",
            notes = "Provides list of Restaurants' details in the response",
            response = Restaurant.class)
    public List<Restaurant> getRestaurantMappings(@PathVariable String areaName,
                                                  @PathVariable String cuisine,
                                                  @PathVariable String rating) {
        return restaurantService.getRestaurantDetails(areaName, cuisine, rating);
    }


}
