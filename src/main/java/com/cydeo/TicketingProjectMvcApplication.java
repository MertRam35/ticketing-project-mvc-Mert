package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketingProjectMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketingProjectMvcApplication.class, args);

        char ch = 'a';
        System.out.println(ch + 0);
        int x = 20 + +9 + -12 + +4 - -13 - +19;
        System.out.println("x = " + x);
    }

}
