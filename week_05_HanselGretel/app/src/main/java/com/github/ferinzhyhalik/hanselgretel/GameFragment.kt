package com.github.ferinzhyhalik.hanselgretel

import android.os.Bundle
import android.transition.Scene
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.github.ferinzhyhalik.hanselgretel.databinding.FragmentGameBinding
import com.github.ferinzhyhalik.hanselgretel.MyApplication.Stage
import timber.log.Timber


class GameFragment : Fragment() {


    private val scenes = MyApplication.stages
    private lateinit var currentScene: Stage
    private var selectedActionId: Int = 0

    override fun onStart(){
        super.onStart()
        Timber.i("onStart called")
    }
    override fun onStop(){
        super.onStop()
        Timber.i("onStop called")
    }
    override fun onResume(){
        super.onResume()
        Timber.i("onResume called")
    }
    override fun onDestroy(){
        super.onDestroy()
        Timber.i("onDestroy called")
    }
    override fun onPause(){
        super.onPause()
        Timber.i("onPause called")
    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        Timber.i("onStart called")
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false)



        currentScene = scenes[0]


        binding.scene = this


        binding.actionButton.setOnClickListener {

            if(binding.actions.checkedRadioButtonId != -1) {

                when (binding.actions.checkedRadioButtonId) {
                    binding.actionOne.id -> selectedActionId = 0
                    binding.actionTwo.id -> selectedActionId = 1
                    binding.actionThree.id -> selectedActionId = 2

                }

                when (currentScene) {
                    scenes[0] -> currentScene = scenes[1] // Intro
                    scenes[1] -> { // The Haunted Forest
                        when(selectedActionId) {
                            0 -> currentScene = scenes[2]
                            1 -> currentScene = scenes[3]
                            2 -> currentScene = scenes[3]
                        }
                    }
                    scenes[2] -> { // Chicken
                        MyApplication.badEnding1 = true
                        ending()
                    }
                    scenes[3] -> { // The Legendary Tree
                        when(selectedActionId) {
                            0 -> currentScene = scenes[5]
                            1 -> currentScene = scenes[6]
                            2 -> currentScene = scenes[4]
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


                if (currentScene.actions[0] == "") binding.actionOne.isEnabled = false else binding.actionOne.isEnabled = true
                if (currentScene.actions[1] == "") binding.actionTwo.isEnabled = false else binding.actionTwo.isEnabled = true
                if (currentScene.actions[2] == "") binding.actionThree.isEnabled = false else binding.actionThree.isEnabled = true


                binding.actions.clearCheck()
                binding.scrollView.fullScroll(ScrollView.FOCUS_UP)
                binding.invalidateAll()
            } else {
                Toast.makeText(this.activity, "Select one of the choice to continue!", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }

    private fun ending() {

        when(selectedActionId) {
            0 -> this.activity!!.onBackPressed()
            1 -> currentScene = scenes[0]
        }
    }

}