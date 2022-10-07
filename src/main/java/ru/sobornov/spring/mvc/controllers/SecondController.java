package ru.sobornov.spring.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Sobornov Vladimir
 * @since : 07.10.2022
 **/
@Controller
@RequestMapping("/second")
public class SecondController {

    @GetMapping("/exit")
    public String sayExit() {
        return "second/exit";
    }
}
