package com.example.a_shinbori.myapplication;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.example.a_shinbori.myapplication.ui.activity.LoginActivity;
import com.example.a_shinbori.myapplication.ui.activity.MainActivity;
import com.example.a_shinbori.myapplication.ui.activity.Sub01Activity;
import com.example.a_shinbori.myapplication.ui.activity.Sub02Activity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.InstrumentationRegistry.getInstrumentation;


@RunWith(AndroidJUnit4.class)
@LargeTest
/**
 * Created by a_shinbori on 2017/06/08.
 */
public class MyAppEspressoTest {

    // テスト実行前に行われるメソッド
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityRule
//            = new ActivityTestRule(MainActivity.class);
    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule
            = new ActivityTestRule(LoginActivity.class);

//    @Test
//    public void listGoesOverTheFold() {
//        onView(withText("Hello World!")).check(matches(isDisplayed()));
//    }

    @Test
    public void loginOk() {
        // LoginActivity
        onView(withId(R.id.btn001)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button1)).perform(click());
        sleep(1000);

        // MainActivity
        mActivityRule = new ActivityTestRule(MainActivity.class);
        onView(withId(R.id.btn001)).perform(click());
        sleep(200);
        onView(withId(R.id.btn002)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button1)).perform(click());
        sleep(200);
        onView(withId(R.id.btn003)).perform(click());
        sleep(500);
        onView(withId(android.R.id.button1)).perform(click());

        // Sub01Activity
        mActivityRule = new ActivityTestRule(Sub01Activity.class);
        onView(withId(R.id.btn001)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button2)).perform(click());
        sleep(200);
        onView(withId(R.id.btn002)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button1)).perform(click());
        sleep(500);

        // Sub01Activity
        mActivityRule = new ActivityTestRule(Sub02Activity.class);
        onView(withId(R.id.btn001)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button2)).perform(click());
        sleep(200);
        onView(withId(R.id.btn002)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button2)).perform(click());
        sleep(200);
        onView(withId(R.id.btn001)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button1)).perform(click());

        // MainActivity
        mActivityRule = new ActivityTestRule(MainActivity.class);
        openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
        onView(withText(R.string.action_settings)).perform(click());

    }
    @Test
    public void endApp() {
        onView(withId(R.id.btn002)).perform(click());
        sleep(200);
        onView(withId(android.R.id.button1)).perform(click());
        sleep(1000);
    }

    public void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}