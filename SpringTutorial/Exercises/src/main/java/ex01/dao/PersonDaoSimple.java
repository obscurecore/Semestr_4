package ex01.dao;

import ex01.domain.Person;
import org.springframework.context.annotation.Bean;

public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        return new Person(name, 18);
    }
}
