package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.assertIfViewIsNotDisplayed
import com.atiurin.sampleapp.helper.isChecked
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.helper.waitForViewVisible
import com.atiurin.sampleapp.pages.UiElementsPage
import org.junit.Assert

object UiElementsPageSteps {
    fun checkIfPageLoaded(): UiElementsPageSteps {
        Assert.assertTrue(UiElementsPage.webView.isViewDisplayed())
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
        Assert.assertFalse(UiElementsPage.checkBoxClickable.isChecked(3))
        return this
    }

    fun checkEnableCheckBoxIsUnmarked(): UiElementsPageSteps {
        Assert.assertFalse(UiElementsPage.checkBoxEnabled.isChecked(3))
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