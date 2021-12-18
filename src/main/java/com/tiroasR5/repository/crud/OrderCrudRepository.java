package com.tiroasR5.repository.crud;

import com.tiroasR5.model.Order;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Danilo Beltran
 */
public interface OrderCrudRepository extends MongoRepository<Order, Integer> {

    /**
     *
     * @param zone
     * @return
     */
    @Query("{'salesMan.zone': ?0}")
    List<Order> findByZone(final String zone);

    /**
     *
     * @param status
     * @return
     */
    @Query("{status: ?0}")
    List<Order> findByStatus(final String status);

    /**
     *
     * @return
     */
    Optional<Order> findTopByOrderByIdDesc();
}
