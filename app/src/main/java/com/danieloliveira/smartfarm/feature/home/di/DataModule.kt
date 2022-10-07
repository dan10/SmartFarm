package com.danieloliveira.smartfarm.feature.home.di

import com.danieloliveira.smartfarm.feature.home.data.repository.ValveRepositoryImpl
import com.danieloliveira.smartfarm.feature.home.domain.repository.ValveRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Singleton
    @Binds
    abstract fun bindsValveRepository(
        valveRepositoryImpl: ValveRepositoryImpl
    ): ValveRepository
}