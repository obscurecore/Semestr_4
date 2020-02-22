package ex01.dao;

import ex01.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoSimple implements PersonDao {
@Autowired
    public Person findByName(String name) {
    System.out.println(name+"name PersonDaoSimple");
    return new Person(name, 18);
    }
}
