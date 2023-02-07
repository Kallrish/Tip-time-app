package com.example.tiptime

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.containsString
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CalculatorTests {
    @get:Rule()
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun calculate_20_percent_tip() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("54.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.swm_round_up_tip))
            .perform(click())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$10.80"))))
    }

    @Test
    fun calculate_20_percent_tip_round_up() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("54.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$11.00"))))
    }

    @Test
    fun calculate_20_percent_tip_zero_value() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("0.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$0.00"))))
    }

    @Test
    fun calculate_18_percent_tip() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("54.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.rb_option_eighteen_percent))
            .perform(click())
        onView(withId(R.id.swm_round_up_tip))
            .perform(click())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$9.72"))))
    }

    @Test
    fun calculate_18_percent_tip_round_up() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("54.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.rb_option_eighteen_percent))
            .perform(click())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$10.00"))))
    }

    @Test
    fun calculate_18_percent_tip_zero_value() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("0.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.rb_option_eighteen_percent))
            .perform(click())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$0.00"))))
    }

    @Test
    fun calculate_15_percent_tip() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("54.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.rb_option_fifteen_percent))
            .perform(click())
        onView(withId(R.id.swm_round_up_tip))
            .perform(click())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$8.10"))))
    }

    @Test
    fun calculate_15_percent_tip_round_up() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("54.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.rb_option_fifteen_percent))
            .perform(click())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$9.00"))))
    }

    @Test
    fun calculate_15_percent_tip_zero_value() {
        onView(withId(R.id.tiet_service_cost))
            .perform(typeText("0.00"))
            .perform(ViewActions.closeSoftKeyboard())
        onView(withId(R.id.rb_option_fifteen_percent))
            .perform(click())
        onView(withId(R.id.bt_calculate))
            .perform(click())
        onView(withId(R.id.tv_tip_result))
            .check(matches(withText(containsString("$0.00"))))
    }
}