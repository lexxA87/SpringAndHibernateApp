package org.example.repositories;

import org.example.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
    public List<Person> findByName(String name);

    public List<Person> findByNameStartingWith(String name);

    public List<Person> findByNameContaining(String name);

    public List<Person> findByNameOrEmail(String name, String email);
}
