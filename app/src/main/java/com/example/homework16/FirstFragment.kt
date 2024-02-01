package com.example.homework16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework16.databinding.FirstFragmentBinding


class FirstFragment : Fragment() {

    private var binding: FirstFragmentBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstFragmentBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        setOnClickListeners()
    }


    private fun setOnClickListeners() {
        binding?.btnSecondFragment?.setOnClickListener {
            val bundle = Bundle()
            bundle.putString(
                "TEXT_FIRST_FRAGMENT",
                binding?.etTextToSecondFragment?.text.toString()
            )

            val fragment = SecondFragment()
            fragment.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment).commit()

        }
    }
}