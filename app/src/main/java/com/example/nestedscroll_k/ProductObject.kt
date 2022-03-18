package com.example.nestedscroll_k

class ProductObject internal constructor(val name: String, val imagePath: String){
    @JvmName("getImagePath1")
    fun getImagePath(): String? {
        return imagePath
    }

    @JvmName("getName1")
    fun getName(): String? {
        return name
    }
}