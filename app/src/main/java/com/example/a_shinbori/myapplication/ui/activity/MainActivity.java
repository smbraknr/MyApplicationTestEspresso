package com.example.a_shinbori.myapplication.ui.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.a_shinbori.myapplication.R;
import com.example.a_shinbori.myapplication.controller.BaseController;
import com.example.a_shinbori.myapplication.controller.MainController;


public class MainActivity extends BaseActivity {

    public MainController controller = new MainController(this);
    private final static int baseLayout = R.layout.activity_main;
    private final static int menuLayout = R.menu.menu_main;

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

        controller.doActivityEvents(BaseController.ON_OPTIONS_ITEM_SELECTED, id);

//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }

        return super.onOptionsItemSelected(item);
    }
}
