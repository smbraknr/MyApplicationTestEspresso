package com.example.a_shinbori.myapplication.ui.listener;

import com.example.a_shinbori.myapplication.controller.Sub01Controller;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class Sub01ButtonListener extends BaseButtonListener {

    Sub01Controller controller;

    public Sub01ButtonListener(Sub01Controller ctrl) {
        controller = ctrl;
    }

    @Override
    protected void onClickBtn(String tagId) {
        controller.doButtonEvents(tagId);
    }
}
