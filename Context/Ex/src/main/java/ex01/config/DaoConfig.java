package ex01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DaoConfig {
   /* @Bean
    public PersonDao personDao() {
        return new PersonDaoSimple();
    }*/
    @Bean
    public String personName() {
        return "Ivan";
    }
}
