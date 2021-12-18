package com.tiroasR5.controller;

import com.tiroasR5.model.Order;
import com.tiroasR5.service.OrderService;
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
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     *
     * @return
     */
    @GetMapping(value = "/all",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Order> getAll() {
        return orderService.getAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<Order> getOrder(@PathVariable("id") int id) {
        return orderService.getOrder(id);
    }

    /**
     *
     * @param gadget
     * @return
     */
    @PostMapping(value = "/new",
                 consumes = {MediaType.APPLICATION_JSON_VALUE},
                 produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public Order create(@RequestBody Order gadget) {
        return orderService.create(gadget);
    }

    /**
     *
     * @param gadget
     * @return
     */
    @PutMapping(value = "/update",
                consumes = {MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public Order update(@RequestBody Order gadget) {
        return orderService.update(gadget);
    }

    /**
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return orderService.delete(id);
    }

    /**
     *
     * @param zona
     * @return
     */
    @GetMapping(value = "/zona/{zona}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Order> findByZone(@PathVariable("zona") String zona) {
        return orderService.findByZone(zona);
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/salesman/{id}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Order> ordersSalesManByID(@PathVariable("id") Integer id) {
        return orderService.ordersSalesManByID(id);
    }

    /**
     *
     * @param state
     * @param id
     * @return
     */
    @GetMapping(value = "/state/{state}/{id}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Order> ordersSalesManByState(@PathVariable("state") String state, @PathVariable("id") Integer id) {
        return orderService.ordersSalesManByState(state, id);
    }

    /**
     *
     * @param dateStr
     * @param id
     * @return
     */
    @GetMapping(value = "/date/{date}/{id}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Order> ordersSalesManByDate(@PathVariable("date") String dateStr, @PathVariable("id") Integer id) {
        return orderService.ordersSalesManByDate(dateStr, id);
    }
}
