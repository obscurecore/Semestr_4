package ex01.config;

import ex01.dao.PersonDao;
import ex01.service.PersonService;
import ex01.service.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {
    @Bean
    public PersonService personService(PersonDao dao) {
        return new PersonServiceImpl(dao);
    }
}
