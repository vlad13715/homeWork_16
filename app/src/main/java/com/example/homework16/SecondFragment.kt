package com.example.homework16

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.homework16.databinding.SecondFragmentBinding


class SecondFragment : Fragment() {
    private var binding: SecondFragmentBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(inflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        setOnClickListeners()
    }


    private fun setOnClickListeners() {
        binding?.btnThirdFragment?.setOnClickListener {
            val bundle = Bundle()
            val value = arguments?.getString("TEXT_FIRST_FRAGMENT")
            bundle.putString("TEXT_SECOND_FRAGMENT", value)

            val fragment = ThirdFragment()
            fragment.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, fragment).commit()

        }
    }
}