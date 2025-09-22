package com.example.ieji

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{

        }
    }

    @Composable
    fun RPGApp(){
        Column(Modifier.padding(16.dp)){
            Text("Personagem", fontSize = 20.sp)
            OutlinedTextField(value = "", onValueChange = {}, label = {
                Text("Nome")
            })
            Text("Força")
            Slider(value = 10f, onValueChange = {}, valueRange = 1f..20f)
        }
    }
}