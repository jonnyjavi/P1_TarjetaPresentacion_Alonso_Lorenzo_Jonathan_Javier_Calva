package com.example.p1_tarjetapresentacion_alonso_lorenzo_jonathan_javier_calva

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.p1_tarjetapresentacion_alonso_lorenzo_jonathan_javier_calva.ui.theme.P1_TarjetaPresentacion_Alonso_Lorenzo_Jonathan_Javier_CalvaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            P1_TarjetaPresentacion_Alonso_Lorenzo_Jonathan_Javier_CalvaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(name = "Sergio Martinez", degree = "Software developer")
                }
            }
        }
    }
}

@Composable
fun GreetingText(name: String, degree: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.padding(12.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.gemini_generated_image_osgh2tosgh2tosgh),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = modifier.size(150.dp)

        )
        Text(
            text = name,
            fontSize = 28.sp,
            modifier = Modifier

        )
        Text(
            text = degree,
            fontSize = 16.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    P1_TarjetaPresentacion_Alonso_Lorenzo_Jonathan_Javier_CalvaTheme {
        GreetingText(name = "Sergio Martinez", degree = "Software developer")
    }
}