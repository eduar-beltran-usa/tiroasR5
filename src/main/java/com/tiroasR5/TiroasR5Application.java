package com.tiroasR5;

import com.tiroasR5.repository.crud.AccessoryCrudRepository;
import com.tiroasR5.repository.crud.OrderCrudRepository;
import com.tiroasR5.repository.crud.UserCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * @author Danilo Beltran
 */
@SpringBootApplication
public class TiroasR5Application implements CommandLineRunner {

    @Autowired
    private AccessoryCrudRepository crudRepository;
    @Autowired
    private UserCrudRepository userCrudRepository;
    @Autowired
    private OrderCrudRepository orderCrudRepository;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(TiroasR5Application.class, args);
    }

    /**
     *
     * @param args
     * @throws Exception
     */
    @Override
    public void run(String... args) throws Exception {
        crudRepository.deleteAll();
        userCrudRepository.deleteAll();
        orderCrudRepository.deleteAll();
    }

}
