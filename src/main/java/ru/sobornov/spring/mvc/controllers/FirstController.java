package ru.sobornov.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : Sobornov Vladimir
 * @since : 07.10.2022
 **/

@Controller
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request){
        String name = request.getParameter("name");
        System.out.println("Name is: " + name);
        return "first/hello";
    }

    @GetMapping("/good-bye")
    public String goodByePage(@RequestParam (value = "name", required = false) String name){
        System.out.println("Name is " + name);
        return "first/good-bye";
    }
}
