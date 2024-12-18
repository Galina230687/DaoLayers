package ru.netology.daoLayersWithHibernate.repository;

import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.AllArgsConstructor;
import ru.netology.daoLayersWithHibernate.dao.Person;

import java.util.List;

@AllArgsConstructor
@Repository
public class PersonRepository {

    @PersistenceContext
    private EntityManager entityManager;
    public List<Person> getPersonsByCity(String city) {
        var query = entityManager.createQuery("SELECT p FROM Person p WHERE p.cityOfLiving = :city")
                .setParameter("city", city);
        return query.getResultList();
    }
}
