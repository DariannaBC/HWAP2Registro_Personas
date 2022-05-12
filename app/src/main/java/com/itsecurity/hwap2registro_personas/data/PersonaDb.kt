package com.itsecurity.hwap2registro_personas.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.itsecurity.hwap2registro_personas.model.Persona

@Database(
    entities = [Persona::class],
    version = 2
)
abstract class PersonaDb: RoomDatabase() {
    abstract  val personaDao: PersonaDao

}
