package com.example.constraintslayout.ui.policyDetails


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.constraintslayout.R


class PolicyCardFragment : Fragment()
{

    var position   = 0


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        return inflater.inflate(R.layout.my_policy_card, container, false)
    }


}
