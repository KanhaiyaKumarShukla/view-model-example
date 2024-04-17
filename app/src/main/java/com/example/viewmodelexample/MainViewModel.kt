package com.example.viewmodelexample

import android.view.View
import androidx.lifecycle.ViewModel

class MainViewModel( initialValue:Int):ViewModel() {
    var count:Int=initialValue
    fun increment(){
        count++;
    }
}