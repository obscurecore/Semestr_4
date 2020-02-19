package ex01.config;

import ex01.dao.PersonDao;
import ex01.dao.PersonDaoSimple;

public class DaoConfig {

    public PersonDao personDao() {
        return new PersonDaoSimple();
    }
}
