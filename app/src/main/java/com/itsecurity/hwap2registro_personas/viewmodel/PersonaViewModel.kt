package com.itsecurity.hwap2registro_personas.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsecurity.hwap2registro_personas.data.PersonaDao
import com.itsecurity.hwap2registro_personas.model.Persona

import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PersonaViewModel @Inject constructor(
    val personaDao:PersonaDao
) : ViewModel(){

    private val _guardado = MutableLiveData(false)
    val guardado: LiveData<Boolean> get() = _guardado

    fun guardar(persona: Persona){
        viewModelScope.launch {
            personaDao.Insertar(persona)
            _guardado.value=true
        }
    }

}