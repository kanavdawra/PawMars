package com.kanavdawra.pawmars.DashBoard.DashBoardFragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kanavdawra.pawmars.DashBoard.DashBoardUtility
import com.kanavdawra.pawmars.PopUpFragmnent
import com.kanavdawra.pawmars.R
import kotlinx.android.synthetic.main.fragment_dash_board_events.*


class DashBoardEventsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_dash_board_events, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        dashboard_events_fab.setOnClickListener {
        PopUpFragmnent(activity!!).create("AddEvent")
        }
    }

    override fun onStart() {
        super.onStart()
        DashBoardUtility().dismiss(activity!!)
    }
}

