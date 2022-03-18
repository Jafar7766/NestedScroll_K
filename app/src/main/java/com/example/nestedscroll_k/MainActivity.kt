package com.example.nestedscroll_k

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bestRecyclerView = findViewById<RecyclerView>(R.id.productList)
        val mGrid = GridLayoutManager(this, 2)
        bestRecyclerView.layoutManager = mGrid
        bestRecyclerView.setHasFixedSize(true)
        val mAdapter = PhoneAdapter(this@MainActivity, productTestData as List<ProductObject>)
        bestRecyclerView.adapter = mAdapter
    }

    private val productTestData: List<Any>
        private get() {
            val featuredProducts: MutableList<ProductObject> = ArrayList<ProductObject>()
            featuredProducts.add(ProductObject("Iphone 6", "iphone2"))
            featuredProducts.add(ProductObject("Iphone 6S", "iphone2"))
            featuredProducts.add(ProductObject("Iphone 8S", "iphone2"))
            featuredProducts.add(ProductObject("Iphone X", "iphone2"))
            featuredProducts.add(ProductObject("Iphone XR", "iphone2"))
            featuredProducts.add(ProductObject("Iphone XS", "iphone2"))
            return featuredProducts
        }
}