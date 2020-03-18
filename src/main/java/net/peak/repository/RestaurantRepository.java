package net.peak.repository;

import net.peak.data.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {

    @Query(value = "SELECT DISTINCT CAMIS FROM restaurants where BORO=:areaName " +
            "&& CUISINE_DESCRIPTION=:cuisine && GRADE<=:grade", nativeQuery = true)
    List<Integer> findByRestaurantRatings(@Param("areaName") String areaName,
                                             @Param("cuisine") String cuisine,
                                             @Param("grade") String grade);

    Restaurant findByCamis(int restaurantId);
}
