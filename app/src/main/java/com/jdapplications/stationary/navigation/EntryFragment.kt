package com.jdapplications.stationary.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_entry.view.*

class EntryFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment


        val view = inflater.inflate(R.layout.fragment_entry, container, false)

//        Alternative, easier way... disables animations, doesn't use the action.
//        view.navigateOverviewButton.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.overviewFragment))

        view.navigateOverviewButton.setOnClickListener {
            val action = EntryFragmentDirections.actionEntryFragmentToOverviewFragment().setOrigin("Entry Fragment")
            view.findNavController().navigate(action)
        }
        return view
    }

}
