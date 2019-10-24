package com.github.ferinzhyhalik.hanselgretel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ScrollView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
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

    fun goToMenu() {
        this.activity!!.onBackPressed()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        Timber.i("onStart called")
        val binding = DataBindingUtil.inflate<FragmentGameBinding>(
            inflater, R.layout.fragment_game, container, false)


        currentScene = scenes[0]

        val screenViewModel = ViewModelProviders.of(this).get(ScreenViewModel::class.java)
        binding.scene = screenViewModel
        binding.lifecycleOwner = this

        screenViewModel.goToMain.observe(this, Observer { yes ->
            if (yes) goToMenu()
        })

        binding.actions.clearCheck()
        binding.scrollView.fullScroll(ScrollView.FOCUS_UP)
        binding.invalidateAll()

        return binding.root
    }
}