package ru.netology.daoLayersWithHibernate.service;

import ru.netology.daoLayersWithHibernate.dao.Person;
import ru.netology.daoLayersWithHibernate.repository.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }
}
