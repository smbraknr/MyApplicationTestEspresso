package com.example.a_shinbori.myapplication.controller;

import android.view.View;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.business.BaseBusiness;
import com.example.a_shinbori.myapplication.business.LoginBusiness;
import com.example.a_shinbori.myapplication.ui.activity.BaseActivity;
import com.example.a_shinbori.myapplication.ui.activity.LoginActivity;
import com.example.a_shinbori.myapplication.ui.listener.BaseButtonListener;
import com.example.a_shinbori.myapplication.ui.listener.LoginButtonListener;
import com.example.a_shinbori.myapplication.ui.listener.MainButtonListener;
import com.example.a_shinbori.myapplication.ui.view.BaseView;
import com.example.a_shinbori.myapplication.ui.view.CommonDialog;
import com.example.a_shinbori.myapplication.ui.view.LoginView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public abstract class BaseController {
    public static final String ON_CREATE = "onCreate";
    public static final String ON_OPTIONS_ITEM_SELECTED = "onOptionsItemSelected";

    protected BaseActivity activity;
    protected BaseView view;
    protected BaseButtonListener btnListener;

    protected List<Object> listeners = new ArrayList<>();

    public void doActivityEvents(String eventId, int id) {
        switch (eventId) {
            case ON_CREATE:
                for (Object listener : listeners) {
                    if (listener instanceof View.OnClickListener) {
                        actSetButtonListeners(activity, (BaseButtonListener)listener);
                    }
                }
                break;
            case ON_OPTIONS_ITEM_SELECTED:
                activity.finishAndRemoveTask();
                break;
        }
    }

    public void doButtonEvents(String eventId) {
        switch (eventId) {
            case MainButtonListener.TAG_BTN_001:
                btnOnClick001();
                break;
            case MainButtonListener.TAG_BTN_002:
                btnOnClick002();
                break;
            case MainButtonListener.TAG_BTN_003:
                btnOnClick003();
                break;
        }
    }

    public void doDialogEvents(int buttonId, String tag) {
        switch (buttonId) {
            case CommonDialog.BUTTON_ID_POSITIVE:
                switch (tag) {
                    case CommonDialog.DIALOG_TAG_BUTTON_001_OK:
                        dialogOnClickButton001Ok();
                        break;
                    case CommonDialog.DIALOG_TAG_BUTTON_002_OK:
                        dialogOnClickButton002Ok();
                        break;
                    case CommonDialog.DIALOG_TAG_BUTTON_003_OK:
                        dialogOnClickButton003Ok();
                        break;
                }
                break;
        }
    }

    protected void actSetButtonListeners(BaseActivity activity, View.OnClickListener listener) {
        activity.setListener(listener, R.id.btn001, BaseButtonListener.TAG_BTN_001);
        activity.setListener(listener, R.id.btn002, BaseButtonListener.TAG_BTN_002);
        activity.setListener(listener, R.id.btn003, BaseButtonListener.TAG_BTN_003);
    }

    protected void btnOnClick001() {}
    protected void btnOnClick002() {}
    protected void btnOnClick003() {}
    protected void dialogOnClickButton001Ok() {}
    protected void dialogOnClickButton002Ok() {}
    protected void dialogOnClickButton003Ok() {}
}
