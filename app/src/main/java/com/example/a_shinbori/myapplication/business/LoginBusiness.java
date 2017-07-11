package com.example.a_shinbori.myapplication.business;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.controller.LoginController;
import com.example.a_shinbori.myapplication.dataInterface.ControllerInterface;

/**
 * Created by a_shinbori on 2017/0
 */
public class LoginBusiness extends BaseBusiness{

    private LoginController controller;

    public LoginBusiness(LoginController ctrl) {
        controller = ctrl;
    }

    public ControllerInterface checkLoginInput(String userId, String password) {
        ControllerInterface ctrlIF = new ControllerInterface();
        if (userId.trim().equals("")) {
            ctrlIF.setResult(ControllerInterface.RESULT_NG_01);
        } else if (password.trim().equals("")) {
            ctrlIF.setResult(ControllerInterface.RESULT_NG_02);
        } else {
            ctrlIF.setResult(ControllerInterface.RESULT_OK);
        }
        return ctrlIF;
    }

}
