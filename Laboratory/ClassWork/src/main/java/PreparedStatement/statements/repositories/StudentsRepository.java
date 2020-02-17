package PreparedStatement.statements.repositories;


import PreparedStatement.statements.models.Student;

public interface StudentsRepository extends CrudRepository<Student> {
    Student findByFirstName(String firstName);
}
