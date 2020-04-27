package spring.hw.fromLesson16.SpringHomework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfiguration {

    @Bean(name = "StudentDAO")
    public StudentDAO getStudentDAO(){
        return new StudentDAO();
    }
}
