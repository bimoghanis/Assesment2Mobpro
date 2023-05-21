package com.d3if3048.assesment1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class TranslateViewModel : ViewModel() {
    private val translationRepository = TranslateRepository()
    private val _indonesianText = MutableLiveData<String>()
    val indonesianText: LiveData<String> get() = _indonesianText

    private val _translationHistory = MutableLiveData<List<String>>()
    val translationHistory: LiveData<List<String>> get() = _translationHistory

    fun translate(germanText: String) {
        viewModelScope.launch {
            val translation = withContext(Dispatchers.IO) {
                translationRepository.translate(germanText)
            }
            _indonesianText.value = translation

            val historyList = _translationHistory.value.orEmpty().toMutableList()
            historyList.add(translation)
            _translationHistory.value = historyList
        }
    }

    @JvmName("getTranslationHistoryLiveData")
    fun getTranslationHistory(): LiveData<List<String>> {
        return translationHistory
    }
}


