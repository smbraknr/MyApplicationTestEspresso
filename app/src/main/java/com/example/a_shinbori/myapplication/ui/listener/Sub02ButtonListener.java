package com.example.a_shinbori.myapplication.ui.listener;

import com.example.a_shinbori.myapplication.controller.Sub02Controller;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class Sub02ButtonListener extends BaseButtonListener {

    Sub02Controller controller;

    public Sub02ButtonListener(Sub02Controller ctrl) {
        controller = ctrl;
    }

    @Override
    protected void onClickBtn(String tagId) {
        controller.doButtonEvents(tagId);
    }
}
