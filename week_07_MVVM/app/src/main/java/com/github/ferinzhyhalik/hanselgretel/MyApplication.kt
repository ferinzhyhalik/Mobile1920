package com.github.ferinzhyhalik.hanselgretel

import android.app.Application

class MyApplication: Application() {

    data class Stage(
        val title: String,
        val body: String,
        val actions: List<String>
    )

    companion object {

        val MAIN_MENU = "Main Menu"
        val TRY_AGAIN = "Try Again"



        val stages: List<Stage> = listOf (
            // 0
            Stage(
                "Introduction",
                "A poor woodcutter and his wife had two children named Hansel and Gretel. Their mother died when they were young. Hansel and Gretel were very sad. Soon their father remarried but their stepmother was very cruel. One day, she took the children deep into the forest and left them there. ",
                actions = listOf(
                    "I get it",
                    "Poor kids",
                    "All of the options are the same.",
                    "so please click one of the options"
                )
            ),

            // 1
            Stage(
                "The Road to the Forest",
                "Before the stepmother left them on the woods, hansel think to use the only bread that they have to make a trail, where they can use the trail to find a way back home\n" +
                        "Hansel used the bread, but Gretel says no, don't use our only food",
                actions = listOf(
                    "\"Okay I won't do it.\"",
                    "\"I don't care, it's for our safety Gretel!\"",
                    "\"It's our only help that we have Gretel\""

                )
            ),

            // 2 badEndingChicken
            Stage(
                "Now hansel and gretel is left on the forest without any trail",
                "Hansel and Gretel would not survived because of your choice",
                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""

                )
            ),

            // 3
            Stage(
                "The Chocolate House",
                "There's a Chocolate Bricks, and the more they see closely, it is a house made out of Chocolate!",
                actions = listOf(
                    "Looking for help from whoever inside the Chocolate House", //best
                    "Eat the chocolates that laying around", //bad
                    "Knock the Door", //normal
                    ""
                )
            ),

            // 4 Normal Ending
            Stage(
                "You Knocked",
                "Both choose to knock on the door" +
                        "turns out the one who opened the door is the witch, both are scared, but the witch offered hospitality",
                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""
                )
            ),

            // 5 Best Ending
            Stage(
                "Both rushed to the door",
                "Hansel and Gretel stuttering to ask for help, thankfully inside are the witch, and the witch offered to take revenge to the stepmother",


                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""
                )
            ),

            // 6 Bad Ending
            Stage(
                "The witch found you",
                "The witch from inside the chocolate house saw you eating her property, and ALAKABAM. Both died.",
                actions = listOf(
                    MAIN_MENU,
                    TRY_AGAIN,
                    ""
                )
            )
        )

            // Ending flags
            var badEnding1 = false
        var badEnding2 = false
        var normalEnding1 = false
        var bestEnding = false

        // Utils
        lateinit var currentDisplayedEnding: Stage
    }
}