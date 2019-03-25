
package com.example.experiment01orm.repository;

import com.example.experiment01orm.entity.Address;
import com.example.experiment01orm.entity.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepository {
    @PersistenceContext
    private EntityManager em;

    public void addUserAddress() {
        User user = new User("BO");
        em.persist(user);
        Address address1 = new Address("956");
        address1.setUser(user);
        em.persist(address1);

        Address address2 = new Address("925");
        address2.setUser(user);
        em.persist(address2);
    }
}