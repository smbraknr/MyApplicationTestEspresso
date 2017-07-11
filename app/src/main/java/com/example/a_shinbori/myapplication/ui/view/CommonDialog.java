package com.example.a_shinbori.myapplication.ui.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.controller.BaseController;
import com.example.a_shinbori.myapplication.ui.activity.BaseActivity;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class CommonDialog extends BaseDialog {

    public static final String DIALOG_TAG_NO_ACTION = "dialogTagNoAction";
    public static final String DIALOG_TAG_BUTTON_001_OK = "dialogTagButton001Ok";
    public static final String DIALOG_TAG_BUTTON_002_OK = "dialogTagButton002Ok";
    public static final String DIALOG_TAG_BUTTON_003_OK = "dialogTagButton003Ok";

    private BaseController controller;
    private String tagId;

    public void showMessage(String message, String positiveText, String negativeText, BaseActivity activity, BaseController ctrl, String tag) {
        setup(message, positiveText, negativeText);
        controller = ctrl;
        tagId = tag;
        show(activity.getFragmentManager(), tag);
    }

    @Override
    protected void onClickPositive() {
        controller.doDialogEvents(BUTTON_ID_POSITIVE, tagId);
    }

    @Override
    protected void onClickNegative() {
    }
}
