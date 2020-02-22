import e01.domain.Person;

/**
 * DTO that represents Account
 */
@SuppressWarnings("all")
public class PersonDto {

    private int id = -1;
    private String name;

    public PersonDto() {
    }

    public PersonDto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Person toDomainObject(PersonDto dto) {
        return new Person(dto.getId(), dto.getName());
    }

    public static PersonDto toDto(Person account) {
        return new PersonDto(account.getId(), account.getName());
    }
}
