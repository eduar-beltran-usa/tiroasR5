package com.tiroasR5.controller;

import com.tiroasR5.model.Accessory;
import com.tiroasR5.service.AccessoryService;
import java.util.List;
import java.util.Optional;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Danilo Beltran
 */
@RestController
@CrossOrigin("*")
@Log
@RequestMapping("/accessory")
public class AccessoryController {

    @Autowired
    private AccessoryService accessoryService;

    /**
     *
     * @return
     */
    @GetMapping(value = "/all",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Accessory> listAll() {
        return accessoryService.listAll();
    }

    /**
     *
     * @param reference
     * @return
     */
    @GetMapping(value = "/{reference}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<Accessory> getAccesory(@PathVariable("reference") String reference) {
        return accessoryService.getAccesory(reference);
    }

    /**
     *
     * @param accessory
     * @return
     */
    @PostMapping(value = "/new",
                 consumes = {MediaType.APPLICATION_JSON_VALUE},
                 produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public Accessory create(@RequestBody Accessory accessory) {
        return accessoryService.create(accessory);
    }

    /**
     *
     * @param accessory
     * @return
     */
    @PutMapping(value = "/update",
                consumes = {MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public Accessory update(@RequestBody Accessory accessory) {
        return accessoryService.update(accessory);
    }

    /**
     *
     * @param reference
     * @return
     */
    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return accessoryService.delete(reference);
    }
}
