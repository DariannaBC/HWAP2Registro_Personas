package com.itsecurity.hwap2registro_personas.data

import androidx.room.*
import com.itsecurity.hwap2registro_personas.model.Persona
import kotlinx.coroutines.flow.Flow

@Dao
interface PersonaDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(persona: Persona )

    @Delete
    suspend fun Eliminar(persona: Persona)


    @Query("""
        SELECT * 
        FROM Personas
        WHERE personaId=:personaId       
    """)
    fun Buscar(personaId: Int): Flow<Persona>

    @Query("""
        SELECT * 
        FROM Personas
        ORDER BY personaId    
    """)
    fun GetLista(): Flow<List<Persona>>

}
