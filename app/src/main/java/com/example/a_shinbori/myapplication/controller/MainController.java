package com.example.a_shinbori.myapplication.controller;

import android.app.Activity;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.business.LoginBusiness;
import com.example.a_shinbori.myapplication.business.MainBusiness;
import com.example.a_shinbori.myapplication.ui.activity.MainActivity;
import com.example.a_shinbori.myapplication.ui.listener.MainButtonListener;
import com.example.a_shinbori.myapplication.ui.view.BaseView;
import com.example.a_shinbori.myapplication.ui.view.CommonDialog;
import com.example.a_shinbori.myapplication.ui.view.MainView;

import java.util.Date;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class MainController extends BaseController {

    MainBusiness business;

    public MainController(Activity act) {
        activity = (MainActivity) act;
        business = new MainBusiness(this);
        view = new MainView(activity);
        btnListener = new MainButtonListener(this);

        listeners.add(btnListener);
    }

    //-------------------------------------------------------------------------------------------
    //  override
    //-------------------------------------------------------------------------------------------

    //--------------------
    // button
    //--------------------
    @Override
    protected void btnOnClick001() {
        String value = view.getText(BaseView.EDIT_TEXT_ID_001);
        Integer size = business.getSize(value);
        view.setText(BaseView.TEXT_VIEW_ID_002, size.toString());
    }

    @Override
    protected void btnOnClick002() {
        CommonDialog dialog = new CommonDialog();
        dialog.showMessage("test message", "ok", "cancel", activity, this, CommonDialog.DIALOG_TAG_BUTTON_002_OK);
    }

    @Override
    protected void btnOnClick003() {
        CommonDialog dialog = new CommonDialog();
        dialog.showMessage("next screen ?", "はい", "いいえ", activity, this, CommonDialog.DIALOG_TAG_BUTTON_003_OK);
    }

    //--------------------
    // dialog
    //--------------------
    @Override
    protected void dialogOnClickButton001Ok() {
        Date date = new Date();
        view.setText(BaseView.TEXT_VIEW_ID_002, date.toString());
    }

    @Override
    protected void dialogOnClickButton002Ok() {
        Date date = new Date();
        view.setText(BaseView.TEXT_VIEW_ID_003, date.toString());
    }

    @Override
    protected void dialogOnClickButton003Ok() {
        view.jumpNextScreen(activity, BaseView.NEXT_ACTIVITY_SUB01, BaseView.REQUEST_CODE_MAIN_SUB01);
    }

}
