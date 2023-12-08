package com.atiurin.sampleapp.steps

import com.atiurin.sampleapp.framework.step
import com.atiurin.sampleapp.pages.FriendsListPage
import com.atiurin.ultron.extensions.click
import com.atiurin.ultron.extensions.isDisplayed

object MainPageSteps {
    // Check that dashboard is loaded
    fun checkDashboard(): MainPageSteps = apply {
        step("Assert friends list page displayed") {
            FriendsListPage.recycler.recyclerViewMatcher.isDisplayed()
        }
        return this
    }

    fun scrollToFriend(name: String): MainPageSteps {
        FriendsListPage.getListItem(name).scrollToItem()
        return this
    }
    fun openChat(name : String): MainPageSteps {
        FriendsListPage.openChat(name)
        return this
    }

    fun openMenu(): MainPageSteps {
        FriendsListPage.mainMenuBtn.click()
        return this
    }

}