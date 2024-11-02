package org.example.dao;

import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDAO {

    public List<Person> index() {
        return null;
    }

    public Person show(int id) {
        return null;
    }

    public void save(Person person) {}

    public void update(int id, Person updatedPerson) {}

    public void delete(int id) {}
}
