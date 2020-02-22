package ex01.service;


import ex01.dao.PersonDao;
import ex01.domain.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonDao dao;


    public PersonServiceImpl(PersonDao dao) {
        System.out.println("autowired in PersonService");
        this.dao = dao;
    }


    public Person getByName(String name) {
        System.out.println(name);
        return dao.findByName(name);
    }
}
