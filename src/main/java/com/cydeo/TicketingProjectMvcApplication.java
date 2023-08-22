package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketingProjectMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectMvcApplication.class, args);

        char ch = 'a';
        System.out.println(ch + 0);
    }

}
