package com.irempakyurek.navigationcomponentexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_addition_result.view.*
import kotlinx.android.synthetic.main.fragment_multiplication_result.view.*

class MultiplicationResultFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_multiplication_result, container, false)

        val bundle:MultiplicationResultFragmentArgs by navArgs()

        val firstValue = bundle.firstValue
        val secondValue = bundle.secondValue

        val multiplyResult = firstValue * secondValue
        view.multiplicationResult.text = multiplyResult.toString()
        return view
    }

}