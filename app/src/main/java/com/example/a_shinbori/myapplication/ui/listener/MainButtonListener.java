package com.example.a_shinbori.myapplication.ui.listener;

import com.example.a_shinbori.myapplication.controller.MainController;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class MainButtonListener extends BaseButtonListener {

    MainController controller;

    public MainButtonListener(MainController ctrl) {
        controller = ctrl;
    }

    @Override
    protected void onClickBtn(String tagId) {
        controller.doButtonEvents(tagId);
    }
}
