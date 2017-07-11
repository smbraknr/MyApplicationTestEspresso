package com.example.a_shinbori.myapplication.business;

import com.example.a_shinbori.myapplication.controller.Sub01Controller;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class Sub01Business extends BaseBusiness{

    private Sub01Controller controller;

    public Sub01Business(Sub01Controller ctrl) {
        controller = ctrl;
    }

    public Integer getSize(String value) {
        return value.length();
    }

}
