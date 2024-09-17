package com.guang.fourkeytoolbox.ui.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.guang.fourkeytoolbox.R
import com.guang.fourkeytoolbox.logic.model.FunctionItem
import com.guang.fourkeytoolbox.ui.BaseActivity

class HomeAdapter(val context: BaseActivity, private val itemList: List<FunctionItem>): RecyclerView.Adapter<HomeAdapter.HomeItemViewHolder>() {
    inner class HomeItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.home_item_textview)
        val cardView: CardView = view.findViewById(R.id.home_item_cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.home_item, parent, false)
        return HomeItemViewHolder(view)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: HomeItemViewHolder, position: Int) {
        val item = itemList[position]
        holder.textView.text = item.text
        holder.cardView.setOnClickListener {
            context.startActivity(item.jumpClass)
        }
    }
}