package com.atiurin.sampleapp.steps

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.matcher.ViewMatchers.isNotChecked
import com.atiurin.sampleapp.helper.assertIfViewIsNotDisplayed
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.waitForViewVisible
import com.atiurin.sampleapp.pages.UiElementsPage
import com.atiurin.ultron.extensions.isDisplayed
import org.junit.Assert

object UiElementsPageSteps {
    fun checkIfPageLoaded(): UiElementsPageSteps {
        onView(UiElementsPage.webView).check(matches(isDisplayed()))
        return this
    }

    fun unMarkEnableCheckBox(): UiElementsPageSteps {
        UiElementsPage.checkBoxEnabled.tap(3)
        return this
    }

    fun unMarkClickableCheckBox(): UiElementsPageSteps {
        UiElementsPage.checkBoxClickable.tap(3)
        return this
    }

    fun checkClickableCheckBoxIsUnmarked(): UiElementsPageSteps {
        onView(UiElementsPage.checkBoxClickable).check(matches(isNotChecked()))
        return this
    }

    fun checkEnableCheckBoxIsUnmarked(): UiElementsPageSteps {
        onView(UiElementsPage.checkBoxEnabled).check(matches(isNotChecked()))
        return this
    }

    fun selectInvisibleOption(): UiElementsPageSteps {
        UiElementsPage.radioInvisibleButton.tap(3)
        return this
    }

    fun validateButtonIsNotVisible(): UiElementsPageSteps {
        UiElementsPage.button.assertIfViewIsNotDisplayed()
        return this
    }
}