package com.galego.copodaagua

import android.content.Context
import androidx.core.content.edit
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class GlassPreferences(private val context: Context) {

    companion object{
        const val PREFS_NAME = "com.galego.copodaagua.preferences"
        const val PREFS_PREFIX ="key_"
    }

    private val sdf = SimpleDateFormat("ddMMyyyy", Locale.US)

    fun save(value: Int){
        println("teste $value")
        context.getSharedPreferences(PREFS_NAME,Context.MODE_PRIVATE).edit {
            putInt(PREFS_PREFIX + sdf.format(Date()),value)
        }


    }
    fun fetch() = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .getInt(PREFS_PREFIX + sdf.format(Date()),0)

}