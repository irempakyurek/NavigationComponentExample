package com.irempakyurek.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_addition_result.*
import kotlinx.android.synthetic.main.fragment_addition_result.view.*

class AdditionResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_addition_result, container, false)

        val bundle:AdditionResultFragmentArgs by navArgs()

        val firstValue = bundle.firstValue
        val secondValue = bundle.secondValue

        val sum = firstValue + secondValue
        view.additionResult.text = sum.toString()

        return view
    }

}