package com.tiroasR5.repository;

import com.tiroasR5.model.Accessory;
import com.tiroasR5.repository.crud.AccessoryCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Danilo Beltran
 */
@Repository
public class AccessoryRepository {

    @Autowired
    private AccessoryCrudRepository crudInterface;

    /**
     *
     * @return
     */
    public List<Accessory> listAll() {
        return crudInterface.findAll();
    }

    /**
     *
     * @param reference
     * @return
     */
    public Optional<Accessory> getAccesory(String reference) {
        return crudInterface.findById(reference);
    }

    /**
     *
     * @param accesory
     * @return
     */
    public Accessory create(Accessory accesory) {
        return crudInterface.save(accesory);
    }

    /**
     *
     * @param accesory
     */
    public void update(Accessory accesory) {
        crudInterface.save(accesory);
    }

    /**
     *
     * @param accesory
     */
    public void delete(Accessory accesory) {
        crudInterface.delete(accesory);
    }
}
