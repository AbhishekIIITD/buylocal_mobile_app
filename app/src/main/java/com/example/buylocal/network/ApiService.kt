package com.example.buylocal.network

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

data class SendOtpRequest(val phone: String)
data class VerifyOtpRequest(val phone: String, val otp: String)

data class AuthResponse(val token: String, val message: String)

interface ApiService {
    @POST("/send-otp")
    suspend fun sendOtp(@Body request: SendOtpRequest): Response<AuthResponse>

    @POST("/verify-otp")
    suspend fun verifyOtp(@Body request: VerifyOtpRequest): Response<AuthResponse>
}