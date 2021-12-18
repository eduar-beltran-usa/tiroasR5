package com.tiroasR5.repository.crud;

import com.tiroasR5.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Danilo Beltran
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {

    /**
     *
     * @param email
     * @return
     */
    public Optional<User> findByEmail(String email);

    /**
     *
     * @param email
     * @param password
     * @return
     */
    public Optional<User> findByEmailAndPassword(String email, String password);

    /**
     *
     * @return
     */
    Optional<User> findTopByOrderByIdDesc();

    /**
     *
     * @param month
     * @return
     */
    List<User> findByMonthBirthtDay(String month);
}
