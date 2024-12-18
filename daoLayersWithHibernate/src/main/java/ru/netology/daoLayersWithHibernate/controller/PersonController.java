package ru.netology.daoLayersWithHibernate.controller;

import ru.netology.daoLayersWithHibernate.dao.Person;
import ru.netology.daoLayersWithHibernate.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    public ResponseEntity<List<Person>> getPersonsByCity(@RequestParam("city") String city) {
        return ResponseEntity.ok(service.getPersonsByCity(city));
    }
}




