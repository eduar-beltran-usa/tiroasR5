package com.tiroasR5.controller;

import com.tiroasR5.model.User;
import com.tiroasR5.service.UserService;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RequestMapping("/user")
public class UserController {



    @Autowired
    private UserService userService;

    /**
     *
     * @return
     */
    @GetMapping(value = "/all",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> listAll() {
        log.info("Controlador Lista de Usuarios");
        return userService.listAll();
    }

    /**
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public Optional<User> getUser(@PathVariable("id") int id) {
        return userService.getUser(id);
    }

    /**
     *
     * @param user
     * @return
     */
    @PostMapping(value = "/new",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    /**
     *
     * @param user
     * @return
     */
    @PutMapping(value = "/update",
                consumes = {MediaType.APPLICATION_JSON_VALUE},
                produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user) {
        return userService.update(user);
    }

    /**
     *
     * @param email
     * @return
     */
    @GetMapping("/emailexist/{email}")
    public boolean emailExist(@PathVariable("email") String email) {
        return userService.emailExist(email);
    }

    /**
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    /**
     *
     * @param email
     * @param password
     * @return
     */
    @GetMapping("/{email}/{password}")
    public User autenticateUser(@PathVariable("email") String email, @PathVariable("password") String password) {
        return userService.autenticateUser(email, password);
    }

    /**
     *
     * @param month
     * @return
     */
    @GetMapping(value = "/birthday/{month}",
                produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<User> listBirthtDayMonth(@PathVariable("month") String month) {
        return userService.listBirthtDayMonth(month);
    }
}
