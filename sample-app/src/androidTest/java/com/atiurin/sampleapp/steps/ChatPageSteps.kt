package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.pages.ChatPage

object ChatPageSteps {
    fun checkChatPageIsDisplayed(): ChatPageSteps {
        ChatPage.assertPageDisplayed()
        return this
    }

    fun sendMessage(message : String): ChatPageSteps {
        ChatPage.sendMessage(message)
        return this
    }

    fun checkIfMessageSent(sentMessage: String): ChatPageSteps {
        ChatPage.assertMessageDisplayed(sentMessage)
        return this
    }


}