package spring.hw.fromLesson16.SpringHomework;

import java.util.List;

public interface DAO {
    Student create(Student st);
    List<Student> readAll();
    void update(Student st);
    void delete(int id);
}
