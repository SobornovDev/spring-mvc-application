package ru.sobornov.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Sobornov Vladimir
 * @since : 07.10.2022
 **/

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(){
        return "first/hello";
    }

    @GetMapping("/good-bye")
    public String goodByePage(){
        return "first/good-bye";
    }
}
