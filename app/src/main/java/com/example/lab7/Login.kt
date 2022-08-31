package com.example.lab7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class Login : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val iniciar: Button = view.findViewById(R.id.button2)
        iniciar.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.action_login_to_home2)
        }

//        val link: TextView = view.findViewById(R.id.textView6)
//        link.setOnClickListener {
//        Navigation.findNavController(it).navigate(R.id.action_login_to_newAccount)
//        }
    }

}