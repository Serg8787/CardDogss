package com.example.carddogs

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import kotlinx.android.parcel.Parcelize
import java.io.Serializable


data class Dog(val name:String,
               val age:String,
               val specias:String,
               val desc:String?,
               val allDesc:String?,
               val facts:String?,
               val avatar:Bitmap?
               ) : Serializable