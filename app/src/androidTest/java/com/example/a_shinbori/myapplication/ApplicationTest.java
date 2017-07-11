package com.example.a_shinbori.myapplication;

//import android.app.Application;
//import android.test.ApplicationTestCase;
//
///**
// * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
// */
//public class ApplicationTest extends ApplicationTestCase<Application> {
//    public ApplicationTest() {
//        super(Application.class);
//    }
//}


import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import com.example.a_shinbori.myapplication.ui.activity.LoginActivity;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest {
    private Activity mActivity;

    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule(LoginActivity.class);

    @Before
    public void setUp(){
        // Activityの取得
        mActivity = mActivityRule.getActivity();
    }

//    @Before
//    public void setUp() throws Exception {
//        super.setUp();
//        injectInstrumentation(InstrumentationRegistry.getInstrumentation());
//    }

    @After
    public void tearDown() throws Exception {
//        super.tearDown();
    }

    @Test
    public void testHomeKey() {
    }

    @Test
    public void testLogin() {
        onView(withId(R.id.btn001)).perform(click());
    }
}