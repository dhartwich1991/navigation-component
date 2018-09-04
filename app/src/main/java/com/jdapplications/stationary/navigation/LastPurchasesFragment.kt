package com.jdapplications.stationary.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_last_purchases.view.*

class LastPurchasesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_last_purchases, container, false)
        view.seeArticlesButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_lastPurchasesFragment_to_articleDetailFragment)
        }

        return view
    }

}
