package com.atiurin.sampleapp.tests.espresso

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.atiurin.sampleapp.activity.MainActivity
import com.atiurin.sampleapp.data.FriendsNames
import com.atiurin.sampleapp.data.SendMessageData
import com.atiurin.sampleapp.helper.isTextOnScreen
import com.atiurin.sampleapp.helper.isViewDisplayed
import com.atiurin.sampleapp.helper.typeText
import com.atiurin.sampleapp.pages.UIElementPage
import com.atiurin.sampleapp.steps.ChatPageSteps
import com.atiurin.sampleapp.steps.CustomClicksPageSteps
import com.atiurin.sampleapp.steps.MainPageSteps
import com.atiurin.sampleapp.steps.MainMenuPageSteps
import com.atiurin.sampleapp.steps.UiElementsPageSteps
import com.atiurin.ultron.extensions.tap
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class ChattingTests {

    @get:Rule
    val activityTestRule = ActivityScenarioRule(MainActivity::class.java)

//    @Test
//    fun textWithMyFriend() {
//        with(UIElementPage) {
//            isTextOnScreen("Friends")
//            nameChandler.isViewDisplayed()
//            nameChandler.tap()
//            textInput.typeText("Hello Rachel")
//
//            messageInputText.isViewDisplayed()
//
//        }
//    }

    @Test
    fun chatWithEmmetBrown() {
        MainPageSteps
            .openChat(FriendsNames.EMMET_BROWN)

        ChatPageSteps
            .checkChatPageIsDisplayed()
            .sendMessage(SendMessageData.EMMET_BROWN_MSG)
            .checkIfMessageSent()
    }

    @Test
    fun chatWithFriend17() {
        MainPageSteps
            .openChat(FriendsNames.FRIEND17)

        ChatPageSteps
            .checkChatPageIsDisplayed()
            .sendMessage(SendMessageData.FRIEND17_MSG)
            .checkIfMessageSent()
    }

    @Test
    fun uiElementsPageTest() {
        MainPageSteps
            .checkDashboard()
            .openMenu()

        MainMenuPageSteps
            .clickOnUiElementsItem()

        UiElementsPageSteps
            .checkIfPageLoaded()
            .unMarkEnableCheckBox()
            .unMarkClickableCheckBox()
            .checkClickableCheckBoxIsUnmarked()
            .checkEnableCheckBoxIsUnmarked()
            .selectInvisibleOption()
            .validateButtonIsNotVisible()
    }
}