package com.example.buylocal.utils

import android.content.Context
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

val Context.dataStore by preferencesDataStore(name = "auth_prefs")

object DataStoreManager {
    private val JWT_TOKEN = stringPreferencesKey("jwt_token")

    suspend fun saveToken(context: Context, token: String) {
        context.dataStore.edit { prefs ->
            prefs[JWT_TOKEN] = token
        }
    }

    suspend fun getToken(context: Context): String? {
        return context.dataStore.data.map { it[JWT_TOKEN] ?: "" }.first()
    }

    suspend fun clearToken(context: Context) {
        context.dataStore.edit {
            it.remove(JWT_TOKEN)
        }
    }
}
