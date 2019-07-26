package com.magere.architecturecomponents

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class DataController {


    private val liveData = MutableLiveData<List<String>>()
    private var mStringList = mutableListOf<String>()

    fun getData(): LiveData<List<String>> {
        return liveData
    }

    fun addData(value: String) {
        mStringList.add(value)

        liveData.value = mStringList

    }

}