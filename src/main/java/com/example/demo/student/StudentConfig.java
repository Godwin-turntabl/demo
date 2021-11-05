package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
                 Student maria=   new Student( "Godwin", "gbenyenugodwin@yahoo.com", LocalDate.of(2000, Month.SEPTEMBER, 12));
                 Student godwin = new Student( "Faith", "faithman@yahoo.com", LocalDate.of(1995, Month.JANUARY, 5));
                    Student alex = new Student( "Alfred",  "ferdo@yahoo.com", LocalDate.of(2000, Month.JUNE, 7));


            repository.saveAll(List.of(maria,godwin,alex));
        };
    };

}
