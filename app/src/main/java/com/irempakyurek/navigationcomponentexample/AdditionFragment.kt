package com.irempakyurek.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_addition.*
import kotlinx.android.synthetic.main.fragment_addition.view.*

class AdditionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_addition, container, false)

        view.buttonAdd.setOnClickListener {

            var firstValue = 0
            var secondValue = 0
            if (!etFirstValue.text.isNullOrEmpty()){
                firstValue = etFirstValue.text.toString().toInt()
            }
            if (!etSecondValue.text.isNullOrEmpty()){
                secondValue = etSecondValue.text.toString().toInt()
            }

            val gecis = AdditionFragmentDirections.additionResultFragmentGecis(firstValue, secondValue)
            Navigation.findNavController(it).navigate(gecis)
        }

        return view
    }

}