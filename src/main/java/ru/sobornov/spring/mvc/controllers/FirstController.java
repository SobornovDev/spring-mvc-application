package ru.sobornov.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.sobornov.spring.mvc.data.PersonPassportData;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author : Sobornov Vladimir
 * @since : 07.10.2022
 **/

@Controller
@RequestMapping("/first")
public class FirstController {

    private final Map<String, PersonPassportData> persons = new HashMap<>();
    public static final String NAME = "name";
    public static final String SURNAME = "surName";

    @GetMapping("/hello")
    public String helloPage(HttpServletRequest request, Model model, @Autowired PersonPassportData personPassportData){
        String name = request.getParameter(NAME);
        String surName = request.getParameter(SURNAME);
        personPassportData.setName(name);
        personPassportData.setSurName(surName);
        String id = UUID.randomUUID().toString();
        persons.put(id, personPassportData);
        model.addAllAttributes(persons);
        return "first/hello";
    }

    @GetMapping("/good-bye")
    public String goodByePage(@RequestParam (value = "name", required = false) String name){
        System.out.println("Name is " + name);
        return "first/good-bye";
    }

}
