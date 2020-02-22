package ex01.dao;

import ex01.domain.Person;

public interface PersonDao {

    Person findByName(String name);
}
