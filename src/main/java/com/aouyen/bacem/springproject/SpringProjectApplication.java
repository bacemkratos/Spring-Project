package com.aouyen.bacem.springproject;

import com.aouyen.bacem.springproject.cotrollers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {
       ApplicationContext ctc = SpringApplication.run(SpringProjectApplication.class, args);

        MyController controller = (MyController) ctc.getBean("myController") ;
        controller.hello();
    }


}

