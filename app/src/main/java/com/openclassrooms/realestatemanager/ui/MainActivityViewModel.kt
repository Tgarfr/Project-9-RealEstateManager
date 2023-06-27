package com.openclassrooms.realestatemanager.ui

import androidx.lifecycle.ViewModel
import com.openclassrooms.realestatemanager.model.Estate
import com.openclassrooms.realestatemanager.repository.EstateRepository

class MainActivityViewModel(private val estateRepository: EstateRepository): ViewModel() {

    fun setSelectedEstateLiveData(estate: Estate) {
        estateRepository.setSelectedEstateLiveData(estate)
    }

}