package spring.hw.fromLesson16.SpringHomework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO implements DAO {

    List<Student> students = new ArrayList<>();


    @Override
    public Student create(Student st) {
        int index = students.size();
        st.setId(index);
        students.add(st);
        return st;
    }

    @Override
    public List<Student> readAll() {
        return students;
    }

    @Override
    public void update(Student st) {
        int i = 0;
        for (Student student : students) {
            if (st.getId() == student.getId()) {
                students.set(i, st);
            }
            i++;
        }
    }

    @Override
    public void delete(int id) {
        students.remove(id);
    }

    @PostConstruct
    private void init() {
        System.out.println("PostConstruct ");
    }


    @PreDestroy
    private void cleanUp() {
        System.out.println("PreDestroy. Thanks for your work StudentDAO");
    }

}
