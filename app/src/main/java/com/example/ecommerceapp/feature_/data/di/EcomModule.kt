package com.example.ecommerceapp.feature_.data.di

import com.example.ecommerceapp.feature_.data.remote.EcomApi
import com.example.ecommerceapp.feature_.data.repo.EcomListRepoImpl
import com.example.ecommerceapp.feature_.domain.repo.EcomListRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object EcomModule {

    @Provides
    @Singleton
    fun providesRetrofitApi(): EcomApi {
        return Retrofit.Builder()
            .addConverterFactory(
                GsonConverterFactory.create()
            )
            .baseUrl("https://ecomapp-74ba5-default-rtdb.asia-southeast1.firebasedatabase.app/")
            .build()
            .create(EcomApi::class.java)
    }

    @Provides
    @Singleton
    fun providesEcomRepo(api: EcomApi): EcomListRepo {
        return EcomListRepoImpl(api)
    }
}