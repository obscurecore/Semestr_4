package entity;

import org.hibernate.annotations.Type;

@Entity
//@Entity(name = "dssad")
//@Table(name = "sadasd") with shema
public class Student {
    @Id
    @GeneratedValue
    int id;
    @Basic(optional = false, fetch = FetchType.LAZY)
//(optional false - not null) 2 kind of select: eager immediately, lazy on call(column)
    @Column(name = "StudentDef", unique = true, nullable = true, insertable = false)
    @Type(type = "text")
    String name;
    private int age = 20;
    //@Formula(id+age)
    private int ageplusid;


    //@EmbeddedId обьект станет ключом айди пропадет
    private Adress adress;


    public Student(String name) {
        this.name = name;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}


