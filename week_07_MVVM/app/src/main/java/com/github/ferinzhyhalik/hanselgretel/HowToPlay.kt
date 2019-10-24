package com.github.ferinzhyhalik.hanselgretel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.github.ferinzhyhalik.hanselgretel.R
import com.github.ferinzhyhalik.hanselgretel.databinding.FragmentHowToPlayBinding
import timber.log.Timber

/**
 * A simple [Fragment] subclass.
 */

class HowToPlay : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Timber.i("onStart called")

        val binding = DataBindingUtil.inflate<FragmentHowToPlayBinding>(inflater,
            R.layout.fragment_how_to_play, container, false)

        return binding.root
    }


}