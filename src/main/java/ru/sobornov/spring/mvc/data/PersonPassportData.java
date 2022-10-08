package ru.sobornov.spring.mvc.data;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @author : Sobornov Vladimir
 * @since : 08.10.2022
 **/

@Data
@Component
public class PersonPassportData {

    private String name;
    private String surName;

}
