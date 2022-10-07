package ru.sobornov.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Sobornov Vladimir
 * @since : 07.10.2022
 **/
@Controller
public class MvcController {
    @GetMapping("/hello")
    public String hello() {
        return "hello-world";
    }
}
