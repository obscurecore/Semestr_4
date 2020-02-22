package e01.repostory;

import e01.domain.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {

    List<Person> findAll();
}
