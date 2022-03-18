package com.example.nestedscroll_k

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class PhoneAdapter internal constructor(
    private val context: Context,
    productList: List<ProductObject>
) :
    RecyclerView.Adapter<PhoneViewHolder>() {
    private val productList: List<ProductObject>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return PhoneViewHolder(view)
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        val productObject: ProductObject = productList[position]
        val imageRes = productObject.getImagePath()
            ?.let { getResourceId(context, it, context.packageName) }
        if (imageRes != null) {
            holder.phoneImage.setImageResource(imageRes)
        }
        holder.phoneName.setText(productObject.getName())
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    companion object {
        @Throws(RuntimeException::class)
        private fun getResourceId(
            context: Context,
            pVariableName: String,
            pPackageName: String
        ): Int {
            return try {
                context.resources.getIdentifier(pVariableName, "drawable", pPackageName)
            } catch (e: Exception) {
                throw RuntimeException("Error getting Resource ID.", e)
            }
        }
    }

    init {
        this.productList = productList
    }

}
