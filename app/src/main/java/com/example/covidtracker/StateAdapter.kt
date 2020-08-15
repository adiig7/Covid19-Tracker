package com.example.covidtracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.list_item.view.*

class StateAdapter (val list: List<StatewiseItem>): BaseAdapter(){
    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = p1 ?: LayoutInflater.from(p2?.context).inflate(R.layout.list_item, p2, false)
        val item = list[p0]
        view.confirmedTv.text = item.confirmed
        view.activeTv.text = item.active
        view.recoveredTv.text = item.recovered
        view.deceasedTv.text = item.deaths
        return view
    }

    override fun getItem(position: Int) = list[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

}