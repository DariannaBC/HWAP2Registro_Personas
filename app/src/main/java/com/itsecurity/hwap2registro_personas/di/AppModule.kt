package com.itsecurity.hwap2registro_personas.di

import android.content.Context
import androidx.room.Room
import com.itsecurity.hwap2registro_personas.data.PersonaDao
import com.itsecurity.hwap2registro_personas.data.PersonaDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Singleton
    @Provides
    fun ProvideTicketDb(@ApplicationContext context: Context): PersonaDb {
        val DATABASE_NAME = "PersonaDb"
        return Room.databaseBuilder(
            context,
            PersonaDb::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun ProvideClienteDAO(prestamosDb: PersonaDb): PersonaDao {
        return prestamosDb.personaDao
    }

}
