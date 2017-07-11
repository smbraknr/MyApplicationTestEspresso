package com.example.a_shinbori.myapplication.controller;

import android.app.Activity;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.business.LoginBusiness;
import com.example.a_shinbori.myapplication.dataInterface.ControllerInterface;
import com.example.a_shinbori.myapplication.ui.activity.LoginActivity;
import com.example.a_shinbori.myapplication.ui.listener.LoginButtonListener;
import com.example.a_shinbori.myapplication.ui.view.BaseView;
import com.example.a_shinbori.myapplication.ui.view.CommonDialog;
import com.example.a_shinbori.myapplication.ui.view.LoginView;

import java.util.Date;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class LoginController extends BaseController {

    LoginBusiness business;

    public LoginController(Activity act) {
        activity = (LoginActivity) act;
        business = new LoginBusiness(this);
        view = new LoginView(activity);
        btnListener = new LoginButtonListener(this);

        listeners.add(btnListener);
    }

    //-------------------------------------------------------------------------------------------
    //  override method
    //-------------------------------------------------------------------------------------------

    //--------------------
    // button
    //--------------------
    @Override
    protected void btnOnClick001() {
        CommonDialog dialog = new CommonDialog();
        String message = "";
        String value01 = view.getText(BaseView.EDIT_TEXT_ID_001);
        String value02 = view.getText(BaseView.EDIT_TEXT_ID_002);
        ControllerInterface ctrlIF = business.checkLoginInput(value01, value02);
        switch (ctrlIF.getResult()) {
            case ControllerInterface.RESULT_OK:
                Date date = new Date();
                message = "ログインします。\n\n" + date.toString();
                dialog.showMessage(message, "ok", "cancel", activity, this, CommonDialog.DIALOG_TAG_BUTTON_001_OK);
                break;
            case ControllerInterface.RESULT_NG_01:
            case ControllerInterface.RESULT_NG_02:
            default:
                message = activity.getString(R.string.W0001);
                dialog.showMessage(message, "ok", "cancel", activity, this, CommonDialog.DIALOG_TAG_NO_ACTION);
                break;
        }
    }

    @Override
    protected void btnOnClick002() {
        CommonDialog dialog = new CommonDialog();
        dialog.showMessage("アプリを終了します。", "ok", "cancel", activity, this, CommonDialog.DIALOG_TAG_BUTTON_002_OK);
    }


    //--------------------
    // dialog
    //--------------------
    @Override
    protected void dialogOnClickButton001Ok() {
        view.jumpNextScreen(activity, BaseView.NEXT_ACTIVITY_MAIN, BaseView.REQUEST_CODE_LOGIN_MAIN);
    }

    @Override
    protected void dialogOnClickButton002Ok() {
        activity.finishAndRemoveTask();
    }

    //-------------------------------------------------------------------------------------------
    //  private
    //-------------------------------------------------------------------------------------------

}
