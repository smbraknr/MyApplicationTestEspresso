package com.example.a_shinbori.myapplication.ui.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.controller.BaseController;
import com.example.a_shinbori.myapplication.controller.Sub02Controller;

public class Sub02Activity extends BaseActivity {

    public Sub02Controller controller = new Sub02Controller(this);
    private final static int baseLayout = R.layout.activity_sub02;
    private final static int menuLayout = R.menu.menu_sub02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(baseLayout);
        controller.doActivityEvents(BaseController.ON_CREATE, 0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(menuLayout, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
