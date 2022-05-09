package com.itsecurity.hwap2registro_personas.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Personas")
data class Persona(
    @PrimaryKey(autoGenerate = true)
    val personaId: Int,
    val nombre: String,
    val balance: Float
) {
    fun guardar(persona: Persona) {

    }
}
