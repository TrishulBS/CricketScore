package com.trishul.common;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Contact {
    private String twitter;
    public Contact(String twitter){
        this.twitter = twitter;
    }
}
