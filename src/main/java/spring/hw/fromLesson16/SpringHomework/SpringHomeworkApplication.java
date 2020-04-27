package spring.hw.fromLesson16.SpringHomework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringHomeworkApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringHomeworkApplication.class, args);

        StudentDAO studentDAO = (StudentDAO) applicationContext.getBean("StudentDAO");

        studentDAO.create(new Student( "Taras", 20));
        studentDAO.create(new Student( "Oksana", 21));
        studentDAO.create(new Student( "Stepan", 23));
        studentDAO.create(new Student( "Ruslana", 28));

        studentDAO.readAll().forEach(student -> System.out.printf
                ("Student with id %d his(her) name %s is %d years old.\n",
                        student.getId(), student.getName(), student.getAge()));

        System.out.println();

        Student updateStudent= new Student("Ruslan",18);
        updateStudent.setId(3);
        studentDAO.update(updateStudent);

        studentDAO.readAll().forEach(student -> System.out.printf
                ("Student with id %d his(her) name %s is %d years old.\n",
                        student.getId(), student.getName(), student.getAge()));
        System.out.println();


        studentDAO.delete(2);


        studentDAO.readAll().forEach(student -> System.out.printf
                ("Student with id %d his(her) name %s is %d years old.\n",
                        student.getId(), student.getName(), student.getAge()));

    }

}






