package com.jdapplications.stationary.navigation


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_overview.view.*

class OverviewFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_overview, container, false)
        view.openActivityButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_overviewFragment_to_stationActivity)
        }

        val origin = OverviewFragmentArgs.fromBundle(arguments).origin
        view.originTextView.text = origin

        return view
    }


}
