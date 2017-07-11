package com.example.a_shinbori.myapplication.ui.listener;

import android.os.Bundle;
import android.view.View;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public abstract class BaseButtonListener implements View.OnClickListener {

    public static final String TAG_ROW = "tagRow";
    public static final String TAG_BTN_001 = "tagBtn01";
    public static final String TAG_BTN_002 = "tagBtn02";
    public static final String TAG_BTN_003 = "tagBtn03";

    /**
     * ボタン押下時の処理
     *
     * @param v
     */
    @Override
    public void onClick(View v) {
        if (v == null) {
            return;
        }

        if (v.getTag() == null) {
            return;
        }

        String tag = "";

        Object objTag = v.getTag();
        if (objTag instanceof String) {
            tag = (String) objTag;
        } else if (objTag instanceof Bundle) {
            tag = TAG_ROW;
        }

        switch (tag) {
            case TAG_ROW:
                break;
            default:
                onClickBtn(tag);
        }
    }

    /**
     * ボタン押下
     */
    protected void onClickBtn(String eventId) {
    }

}
