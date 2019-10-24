package com.github.ferinzhyhalik.hanselgretel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.github.ferinzhyhalik.hanselgretel.databinding.FragmentEndingDisplayBinding
import timber.log.Timber


/**
 * A simple [Fragment] subclass.
 */
class EndingDisplay : Fragment() {

    val currentEnding: MyApplication.Stage =
        MyApplication.currentDisplayedEnding


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


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Timber.i("onStart called")

        val binding = DataBindingUtil.inflate<FragmentEndingDisplayBinding>(inflater,
            R.layout.fragment_ending_display,container, false)

        binding.endingDisplay = this

        return binding.root
    }


}
