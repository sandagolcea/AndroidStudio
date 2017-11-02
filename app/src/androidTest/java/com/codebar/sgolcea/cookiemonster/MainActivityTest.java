package com.codebar.sgolcea.cookiemonster;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by sgolcea on 02/11/2017.
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void counterStartsAtZero() throws Exception {
        onView(withId(R.id.counter)).check(matches(withText("0")));
    }

    @Test
    public void counterShowsClickedNumber() throws Exception {
        ViewInteraction myImage = onView(withId(R.id.imgCookie));
        for (int i=0; i<30; i++) { myImage.perform(click()); };
        onView(withId(R.id.counter)).check(matches(withText("30")));
    }
}
