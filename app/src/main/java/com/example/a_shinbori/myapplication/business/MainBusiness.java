package com.example.a_shinbori.myapplication.business;

import com.example.a_shinbori.myapplication.controller.MainController;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class MainBusiness extends BaseBusiness{

    private MainController controller;

    public MainBusiness(MainController ctrl) {
        controller = ctrl;
    }

    public Integer getSize(String value) {
        return value.length();
    }

}
