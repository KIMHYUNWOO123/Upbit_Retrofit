package com.example.upbit_retrofit.Retrofit

data class Response(
    val unit: Int,
    val candles: List<CoinPrice>
)

data class CoinPrice(
    val tradePrice: Float
)
