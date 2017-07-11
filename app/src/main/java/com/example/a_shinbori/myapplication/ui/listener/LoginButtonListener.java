package com.example.a_shinbori.myapplication.ui.listener;

import com.example.a_shinbori.myapplication.controller.LoginController;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class LoginButtonListener extends BaseButtonListener {

    LoginController controller;

    public LoginButtonListener(LoginController ctrl) {
        controller = ctrl;
    }

    @Override
    protected void onClickBtn(String tagId) {
        controller.doButtonEvents(tagId);
    }
}
