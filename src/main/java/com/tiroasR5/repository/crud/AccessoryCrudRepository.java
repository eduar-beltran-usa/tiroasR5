package com.tiroasR5.repository.crud;

import com.tiroasR5.model.Accessory;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Danilo Beltran
 */
public interface AccessoryCrudRepository extends MongoRepository<Accessory, String> {

}
