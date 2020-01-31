package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class HomeAdress {
    @Id
    @GeneratedValue
    int id;
    String street;
}
