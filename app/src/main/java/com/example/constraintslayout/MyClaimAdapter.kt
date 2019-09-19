package com.example.constraintslayout

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class MyClaimAdapter(val claimList: Array<MyClaimModel>) : RecyclerView.Adapter<MyClaimAdapter.ClaimViewHolder>()

{
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ClaimViewHolder
    {
        val  v = LayoutInflater.from(p0?.context).inflate(R.layout.my_claim_card,p0,false)
        return  ClaimViewHolder(v)
    }

    override fun getItemCount(): Int
    {
        return  claimList.size
    }

    override fun onBindViewHolder(p0: ClaimViewHolder, p1: Int)
    {

    }



    class  ClaimViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView)
    {


    }


}