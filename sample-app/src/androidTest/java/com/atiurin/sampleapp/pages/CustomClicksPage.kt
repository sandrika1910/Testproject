package com.atiurin.sampleapp.pages

import android.view.View
import androidx.test.espresso.matcher.ViewMatchers.withId
import org.hamcrest.Matcher
import com.atiurin.sampleapp.R

object CustomClicksPage {
    val topLeftRB: Matcher<View> by lazy { withId(R.id.rB_top_left)}
    val topRightRB: Matcher<View> by lazy { withId(R.id.rB_top_right)}
    val bottomLeft: Matcher<View> by lazy { withId(R.id.rB_bottom_right)}
    val bottomRight: Matcher<View> by lazy { withId(R.id.rB_bottom_right)}

}