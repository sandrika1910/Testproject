package com.atiurin.sampleapp.steps

import androidx.test.espresso.matcher.ViewMatchers
import com.atiurin.sampleapp.R
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.CustomClicksPage
import com.atiurin.ultron.extensions.clickTopLeft
import com.atiurin.ultron.extensions.isChecked
import org.junit.Assert

object CustomClicksPageSteps {
    fun selectAllCorners(): CustomClicksPageSteps {
        CustomClicksPage.topLeftRB.tap()
        CustomClicksPage.topRightRB.tap()
        CustomClicksPage.bottomRight.tap()
        CustomClicksPage.bottomLeft.tap()
        return this
    }
    fun checkCornersChecked(): CustomClicksPageSteps {
        Assert.assertTrue(CustomClicksPage.topLeftRB.isChecked(3))
        Assert.assertTrue(CustomClicksPage.topRightRB.isChecked(3))
        Assert.assertTrue(CustomClicksPage.bottomLeft.isChecked(3))
        Assert.assertTrue(CustomClicksPage.bottomRight.isChecked(3))
        return this
    }
}