package com.example.appbychatgpt

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface AlphaVantageAPI {
  companion object {
    const val BASE_URL = "https://www.alphavantage.co/"
    const val API_KEY = "XTNA4BQD2XVE9Q0B"
  }

  @GET("query")
  fun getStockPrices(
    @Query("function") function: String = "GLOBAL_QUOTE",
    @Query("symbol") symbol: String,
    @Query("apikey") apiKey: String = API_KEY
  ): Call<StockResponse>
}
