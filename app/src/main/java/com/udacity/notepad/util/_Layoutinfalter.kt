package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by andrew on 09.06.2019.
 */
val Context.layoutInflater  get() = LayoutInflater.from(this)