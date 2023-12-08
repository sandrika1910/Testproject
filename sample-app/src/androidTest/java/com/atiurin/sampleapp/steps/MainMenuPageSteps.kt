package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.helper.tap
import com.atiurin.sampleapp.pages.MainManuPage

object MainMenuPageSteps {
    fun tapCustomClick(): MainMenuPageSteps {
        MainManuPage.customClicksItem.tap(5)
        return this
    }

    fun clickOnUiElementsItem() : MainMenuPageSteps {
        MainManuPage.uiElementsItem.tap(5)
        return this
    }
}