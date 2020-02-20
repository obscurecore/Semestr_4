package ex01.config;

import ex01.dao.PersonDao;
import ex01.dao.PersonDaoSimple;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
    @Bean
    public PersonDao personDao() {
        return new PersonDaoSimple();
    }
}
