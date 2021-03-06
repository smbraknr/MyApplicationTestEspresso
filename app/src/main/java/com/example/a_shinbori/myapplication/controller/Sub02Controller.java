package com.example.a_shinbori.myapplication.controller;

import android.app.Activity;

import com.example.a_shinbori.myapplication.business.Sub02Business;
import com.example.a_shinbori.myapplication.ui.activity.Sub02Activity;
import com.example.a_shinbori.myapplication.ui.listener.BaseButtonListener;
import com.example.a_shinbori.myapplication.ui.listener.MainButtonListener;
import com.example.a_shinbori.myapplication.ui.listener.Sub02ButtonListener;
import com.example.a_shinbori.myapplication.ui.view.BaseDialog;
import com.example.a_shinbori.myapplication.ui.view.BaseView;
import com.example.a_shinbori.myapplication.ui.view.CommonDialog;
import com.example.a_shinbori.myapplication.ui.view.Sub02View;

import java.util.Date;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class Sub02Controller extends BaseController {

    private Sub02Business business;

    public Sub02Controller(Activity act) {
        activity = (Sub02Activity) act;
        business = new Sub02Business(this);
        view = new Sub02View(activity);
        btnListener = new Sub02ButtonListener(this);

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
        CommonDialog dialog = new CommonDialog();
        dialog.showMessage("return to Main", "はい", "いいえ", activity, this,  CommonDialog.DIALOG_TAG_BUTTON_001_OK);
    }

    @Override
    protected void btnOnClick002() {
        CommonDialog dialog = new CommonDialog();
        dialog.showMessage("return to Sub01", "ok", "cancel", activity, this,  CommonDialog.DIALOG_TAG_BUTTON_002_OK);
    }

    @Override
    protected void btnOnClick003() {
        CommonDialog dialog = new CommonDialog();
        dialog.showMessage("next screen ?", "はい", "いいえ", activity, this,  CommonDialog.DIALOG_TAG_BUTTON_003_OK);
    }

    //--------------------
    // dialog
    //--------------------

    @Override
    protected void dialogOnClickButton003Ok() {
        Date date = new Date();
        view.setText(BaseView.TEXT_VIEW_ID_003, date.toString());
    }

    @Override
    protected void dialogOnClickButton002Ok() {
        view.jumpNextScreen(activity, BaseView.NEXT_ACTIVITY_SUB01, BaseView.REQUEST_CODE_SUB02_SUB01);
        activity.finish();
    }

    @Override
    protected void dialogOnClickButton001Ok() {
        activity.finish();
    }
}
