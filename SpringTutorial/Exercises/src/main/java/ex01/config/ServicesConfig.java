package ex01.config;

import ex01.dao.PersonDao;
import ex01.service.PersonService;
import ex01.service.PersonServiceImpl;

public class ServicesConfig {

    public PersonService personService(PersonDao dao) {
        return new PersonServiceImpl(dao);
    }
}
