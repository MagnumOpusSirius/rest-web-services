package com.journey1.restfulwebservices.controller;

import lombok.Data;
import lombok.Getter;
import lombok.ToString;

@Data
@ToString
public class HelloWorldBean {
    private String msg;
    public HelloWorldBean(String msg) {
        this.msg= msg;
    }
}
