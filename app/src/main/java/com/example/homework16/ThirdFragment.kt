package com.example.homework16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework16.databinding.ThirdFragmentBinding


class ThirdFragment : Fragment() {

    private var binding: ThirdFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ThirdFragmentBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.tvTextSecondFragment?.text = arguments?.getString("TEXT_SECOND_FRAGMENT")
        setOnClickListeners()
    }

    private fun setOnClickListeners() {
        binding?.btnFirstFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, FirstFragment()).commit()
        }
        binding?.btnSecondFragment?.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SecondFragment()).commit()
        }
    }
}