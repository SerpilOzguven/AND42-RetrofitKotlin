package com.serpilozguven.retrofitkotlin.service

import com.serpilozguven.retrofitkotlin.model.CryptoModel
import io.reactivex.Observable
import io.reactivex.internal.operators.observable.ObservableAll
import retrofit2.Call
import retrofit2.http.GET

interface CryptoAPI {

    //GET,POST,UPDATE,DELETE

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    fun getData():Observable<List<CryptoModel>>


    //fun getData(): Call<List<CryptoModel>>
}