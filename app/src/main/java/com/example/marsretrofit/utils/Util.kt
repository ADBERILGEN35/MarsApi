package com.example.marsretrofit.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

fun ImageView.loadUrl(image: String) {
    image.let {
        Glide.with(context)
            .load(image)
            .into(this)
    }
}

@BindingAdapter("android:downloadImageUrl")
fun downloadImage(view: ImageView, image: String) {
    view.loadUrl(image)
}