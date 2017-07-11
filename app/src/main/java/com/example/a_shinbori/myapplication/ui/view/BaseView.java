package com.example.a_shinbori.myapplication.ui.view;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.ui.activity.BaseActivity;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class BaseView {

    public static final String NEXT_ACTIVITY_MAIN = "com.example.a_shinbori.myapplication.ui.activity.MainActivity";
    public static final String NEXT_ACTIVITY_SUB01 = "com.example.a_shinbori.myapplication.ui.activity.Sub01Activity";
    public static final String NEXT_ACTIVITY_SUB02 = "com.example.a_shinbori.myapplication.ui.activity.Sub02Activity";

    public static final int REQUEST_CODE_LOGIN_MAIN = 10001;
    public static final int REQUEST_CODE_MAIN_SUB01 = 10101;
    public static final int REQUEST_CODE_SUB01_SUB02 = 20102;
    public static final int REQUEST_CODE_SUB02_MAIN = 20201;
    public static final int REQUEST_CODE_SUB02_SUB01 = 20202;

    public static final int TEXT_VIEW_ID_001 = R.id.textView001;
    public static final int TEXT_VIEW_ID_002 = R.id.textView002;
    public static final int TEXT_VIEW_ID_003 = R.id.textView003;

    public static final int EDIT_TEXT_ID_001 = R.id.editText001;
    public static final int EDIT_TEXT_ID_002 = R.id.editText002;
    //public static final int EDIT_TEXT_ID_003 = R.id.editText003;

    protected BaseActivity activity;

    public String getText(int resourceId) {
        String text = "";
        View view = activity.findViewById(resourceId);
        if (view instanceof EditText) {
            text = ((EditText) view).getText().toString();
        } else if (view instanceof TextView) {
            text = ((TextView) view).getText().toString();
        }
        return text;
    }

    public void setText(int resourceId, String value) {
        View view = activity.findViewById(resourceId);
        if (view instanceof EditText) {
            ((EditText) view).setText(value);
        } else if (view instanceof TextView) {
            ((TextView) view).setText(value);
        }
    }

    /**
     * 次画面に遷移
     * @param activity
     * @param nextActivity
     * @param requestCode
     */
    public void jumpNextScreen(BaseActivity activity, String nextActivity, int requestCode) {
        Intent intent = new Intent(activity.getIntent());
        intent.setClassName(activity, nextActivity);
        intent.setAction(Intent.ACTION_VIEW);
        activity.startActivityForResult(intent, requestCode);
    }
}
