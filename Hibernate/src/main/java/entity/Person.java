package entity;

import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToOne
    private HomeAdress homeAdress;
    @ManyToMany
    private List<HomeAdress> homeAdressList;


}
