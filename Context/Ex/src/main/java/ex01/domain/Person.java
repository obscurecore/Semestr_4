package ex01.domain;



public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        System.out.println("autowired in domain Person");
        System.out.println(name+""+age+"" +"person contructor");
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
