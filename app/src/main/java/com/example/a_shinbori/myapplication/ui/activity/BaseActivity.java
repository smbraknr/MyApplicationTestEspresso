package com.example.a_shinbori.myapplication.ui.activity;

import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.ui.listener.BaseButtonListener;

/**
 * Created by a_shinbori on 2017/06/07.
 */
public class BaseActivity extends Activity {

    public void setListener(View.OnClickListener listener, int resourceId, String tagId) {
        if (listener instanceof BaseButtonListener) {
            Button btn;
            btn = (Button) findViewById(resourceId);
            if (btn == null) {
                return;
            }
            btn.setTag(tagId);
            btn.setOnClickListener(listener);
        }
    }
}
