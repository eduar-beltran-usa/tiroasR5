package com.tiroasR5.service;

import com.tiroasR5.model.Accessory;
import com.tiroasR5.repository.AccessoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Danilo Beltran
 */
@Service
public class AccessoryService {

    @Autowired
    private AccessoryRepository accessoryRepository;

    /**
     *
     * @return
     */
    public List<Accessory> listAll() {
        return accessoryRepository.listAll();
    }

    /**
     *
     * @param reference
     * @return
     */
    public Optional<Accessory> getAccesory(String reference) {
        return accessoryRepository.getAccesory(reference);
    }

    /**
     *
     * @param accessory
     * @return
     */
    public Accessory create(Accessory accessory) {
        if (accessory.getReference() == null) {
            return accessory;
        } else {
            return accessoryRepository.create(accessory);
        }
    }

    /**
     *
     * @param accessory
     * @return
     */
    public Accessory update(Accessory accessory) {

        if (accessory.getReference() != null) {
            Optional<Accessory> accesoryDb = accessoryRepository.getAccesory(accessory.getReference());
            if (!accesoryDb.isEmpty()) {
                if (accessory.getBrand() != null) {
                    accesoryDb.get().setBrand(accessory.getBrand());
                }

                if (accessory.getCategory() != null) {
                    accesoryDb.get().setCategory(accessory.getCategory());
                }

                if (accessory.getMaterial() != null) {
                    accesoryDb.get().setMaterial(accessory.getMaterial());
                }

                if (accessory.getDescription() != null) {
                    accesoryDb.get().setDescription(accessory.getDescription());
                }
                if (accessory.getPrice() != 0.0) {
                    accesoryDb.get().setPrice(accessory.getPrice());
                }
                if (accessory.getQuantity() != 0) {
                    accesoryDb.get().setQuantity(accessory.getQuantity());
                }
                if (accessory.getPhotography() != null) {
                    accesoryDb.get().setPhotography(accessory.getPhotography());
                }
                accesoryDb.get().setAvailability(accessory.isAvailability());
                accessoryRepository.update(accesoryDb.get());
                return accesoryDb.get();
            } else {
                return accessory;
            }
        } else {
            return accessory;
        }
    }

    /**
     *
     * @param reference
     * @return
     */
    public boolean delete(String reference) {
        Boolean aBoolean = getAccesory(reference).map(accessory -> {
            accessoryRepository.delete(accessory);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
