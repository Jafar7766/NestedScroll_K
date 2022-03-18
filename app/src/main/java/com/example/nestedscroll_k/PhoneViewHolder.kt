package com.example.nestedscroll_k

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PhoneViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var phoneImage: ImageView
    var phoneName: TextView

    init {
        phoneName = itemView.findViewById(R.id.phoneName)
        phoneImage = itemView.findViewById(R.id.phoneImage)
    }
}
