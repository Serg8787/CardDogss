package com.example.carddogs

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable


data class Dog(val name:String,
               val lastName:String,
               val desc:String
               ) : Serializable