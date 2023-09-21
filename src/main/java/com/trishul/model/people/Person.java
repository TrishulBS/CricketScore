package com.trishul.model.people;

import com.trishul.common.Contact;
import com.trishul.common.PersonalInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Person {
    private String name;
    private PersonalInfo personalInfo;

    public Person(String name){
        this.name = name;
    }

    private Contact contact;

}
