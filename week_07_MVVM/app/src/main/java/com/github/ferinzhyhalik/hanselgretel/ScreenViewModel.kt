package com.github.ferinzhyhalik.hanselgretel

import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ScrollView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScreenViewModel: ViewModel() {
    var _scene = MutableLiveData<MyApplication.Stage>()
    val scene: LiveData<MyApplication.Stage>
        get() = _scene
    var selectedButton = -1
    var scenes = MyApplication.stages
    init {
        _scene.value = scenes[0]
    }
    private var _goToMain = MutableLiveData<Boolean>()
    val goToMain: LiveData<Boolean>
        get() = _goToMain
    fun ending() {
        when(selectedButton) {
            0 -> _goToMain.value = true
            1 -> _scene.value = scenes[0]
        }

    }
    fun onButtonPress(actions: RadioGroup, opt1: RadioButton, opt2: RadioButton, opt3: RadioButton, scrollView: ScrollView) {
        val checked = actions.checkedRadioButtonId
        when(checked) {
            opt1.id -> selectedButton = 0
            opt2.id -> selectedButton = 1
            opt3.id -> selectedButton = 2
        }
        if(checked != -1) {
            when(checked) {
                opt1.id -> selectedButton = 0
                opt2.id -> selectedButton = 1
                opt3.id -> selectedButton = 2
            }
        }
        when(_scene.value) {
            scenes[0] -> _scene.value = scenes[1] // Intro
            scenes[1] -> { // The Haunted Forest
                when(selectedButton) {
                    0 -> _scene.value = scenes[2]
                    1 -> _scene.value = scenes[3]
                    2 -> _scene.value = scenes[3]
                }
            }
            scenes[2] -> { // Chicken
                MyApplication.badEnding1 = true
                ending()
            }
            scenes[3] -> { // The Legendary Tree
                when(selectedButton) {
                    0 -> _scene.value = scenes[5]
                    1 -> _scene.value = scenes[6]
                    2 -> _scene.value = scenes[4]
                }
            }
            scenes[4] -> { //Normal Ending
                MyApplication.normalEnding1 = true
                ending()
            }
            scenes[5] -> { //Best Ending
                MyApplication.normalEnding1 = true
                ending()
            }
            scenes[6] -> { //Bad Ending 2
                MyApplication.badEnding2 = true
                ending()
            }
        }
    }
}