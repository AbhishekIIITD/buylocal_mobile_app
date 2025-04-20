package com.example.buylocal.ui.screens
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun OtpScreen(navController: NavController, phone: String) {
    val context = LocalContext.current
    var otp by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Verify OTP",
            fontSize = 24.sp,
            color = Color(0xFF1D4ED8)
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text("Code sent to +91-$phone")

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedTextField(
            value = otp,
            onValueChange = {
                if (it.length <= 6) otp = it
            },
            label = { Text("Enter 6-digit OTP") },
            keyboardOptions = KeyboardOptions(
                capitalization = KeyboardCapitalization.None,
                autoCorrect = true,
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        Button(
            onClick = {
                if (otp.length == 6) {
                    // TODO: Call your API to verify OTP
                    Toast.makeText(context, "OTP Verified!", Toast.LENGTH_SHORT).show()
                    navController.navigate("home") // Navigate to home screen
                } else {
                    Toast.makeText(context, "Enter a valid 6-digit OTP", Toast.LENGTH_SHORT).show()
                }
            },
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF1D4ED8)),
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
        ) {
            Text("Verify", fontSize = 18.sp, color = Color.White)
        }

        Spacer(modifier = Modifier.height(16.dp))

        TextButton(onClick = {
            // TODO: Trigger resend OTP via API
            Toast.makeText(context, "Resending OTP...", Toast.LENGTH_SHORT).show()
        }) {
            Text("Resend OTP", color = Color(0xFF1D4ED8))
        }
    }
}
