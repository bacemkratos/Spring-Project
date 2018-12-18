package com.aouyen.bacem.springproject.cotrollers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello()
    {
        System.out.println("hello!");
        return null ;
    }
}
