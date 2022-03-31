package com.itgenius.layoutactivityfragment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.itgenius.layoutactivityfragment.R

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnNext = view.findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {
            // การเปลี่ยน Fragment ไปยัง firstFragment
            // findNavController().navigate(R.id.firstFragment)

            // หากต้องการ clear stack ที่ซ้อนกันอยู่ทั้งหมดออกไป
            findNavController().popBackStack(R.id.firstFragment, false)
        }
    }

}