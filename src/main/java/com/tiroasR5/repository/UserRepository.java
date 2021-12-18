package com.tiroasR5.repository;

import com.tiroasR5.model.User;
import com.tiroasR5.repository.crud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Danilo Beltran
 */
@Slf4j
@Repository
public class UserRepository {

    @Autowired
    private UserCrudRepository crudInterface;

    /**
     *
     * @return
     */
    public List<User> listAll() {
        log.info("Repositorio Lista de Usuarios");
        return crudInterface.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public Optional<User> getUser(int id) {
        return crudInterface.findById(id);
    }

    /**
     *
     * @param user
     * @return
     */
    public User create(User user) {
        return crudInterface.save(user);
    }

    /**
     *
     * @param user
     */
    public void update(User user) {
        crudInterface.save(user);
    }

    /**
     *
     * @param user
     */
    public void delete(User user) {
        crudInterface.delete(user);
    }

    /**
     *
     * @param email
     * @return
     */
    public boolean emailExist(String email) {
        Optional<User> usuario = crudInterface.findByEmail(email);

        return !usuario.isEmpty();
    }

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public Optional<User> autenticateUser(String email, String password) {
        return crudInterface.findByEmailAndPassword(email, password);
    }

    /**
     *
     * @return
     */
    public Optional<User> lastUserId() {
        return crudInterface.findTopByOrderByIdDesc();
    }

    /**
     *
     * @param month
     * @return
     */
    public List<User> listBirthtDayMonth(String month) {
        return crudInterface.findByMonthBirthtDay(month);
    }
}
