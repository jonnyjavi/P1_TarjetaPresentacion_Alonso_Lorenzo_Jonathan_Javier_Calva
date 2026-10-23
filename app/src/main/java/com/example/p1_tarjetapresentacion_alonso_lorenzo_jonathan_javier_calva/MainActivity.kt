package com.example.p1_tarjetapresentacion_alonso_lorenzo_jonathan_javier_calva

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
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
                    BusinessCard(name = stringResource(R.string.name), degree = stringResource(R.string.degree))
                }
            }
        }
    }
}

@Composable
fun BusinessCard(name: String, degree: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(216, 187, 255))
            .padding(10.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(R.drawable.gemini_generated_image_osgh2tosgh2tosgh),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .fillMaxWidth(0.5f)
                    .height(200.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .border(
                        width = 2.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(15.dp)
                    )
            )
            Text(
                text = name,
                fontSize = 32.sp,
                modifier = Modifier

            )
            Text(
                text = degree,
                fontSize = 20.sp,
            )
        }

        Column() { }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    P1_TarjetaPresentacion_Alonso_Lorenzo_Jonathan_Javier_CalvaTheme {
        BusinessCard(name = "Alonso Y Jonathan", degree = "Software developers")
    }
}