package com.example.a_shinbori.myapplication.business;

import com.example.a_shinbori.myapplication.controller.Sub01Controller;
import com.example.a_shinbori.myapplication.controller.Sub02Controller;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class Sub02Business extends BaseBusiness{

    private Sub02Controller controller;

    public Sub02Business(Sub02Controller ctrl) {
        controller = ctrl;
    }

    public Integer getSize(String value) {
        return value.length();
    }

}
