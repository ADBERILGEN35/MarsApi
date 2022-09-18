package com.example.marsretrofit.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Mars model
 *
 * @property price
 * @property id
 * @property type
 * @property img_src
 * @constructor Create empty Mars model
 *
 * The data from the api is being parsed.
 */
@Parcelize
data class MarsModel(

    val price: String,
    val id: String,
    val type: String,
    val img_src: String
) : Parcelable
