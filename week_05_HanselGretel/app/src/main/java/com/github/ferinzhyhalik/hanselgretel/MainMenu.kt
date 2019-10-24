package com.github.ferinzhyhalik.hanselgretel

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.github.ferinzhyhalik.hanselgretel.databinding.FragmentMainMenuBinding
import timber.log.Timber

class MainMenu : Fragment() {
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


        val binding = DataBindingUtil.inflate<FragmentMainMenuBinding>(inflater,
            R.layout.fragment_main_menu, container, false)

        // Listeners ...
        binding.startButton.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainMenu_to_gameFragment)
        }

        return binding.root
    }

}
