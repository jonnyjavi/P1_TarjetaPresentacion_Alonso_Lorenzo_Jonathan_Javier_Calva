package com.example.p1_tarjetapresentacion_alonso_lorenzo_jonathan_javier_calva

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.core.view.WindowCompat
import com.example.p1_tarjetapresentacion_alonso_lorenzo_jonathan_javier_calva.ui.theme.P1_TarjetaPresentacion_Alonso_Lorenzo_Jonathan_Javier_CalvaTheme
import androidx.core.net.toUri


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.enableEdgeToEdge(window)
        setContent {
            P1_TarjetaPresentacion_Alonso_Lorenzo_Jonathan_Javier_CalvaTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard(
                        name = stringResource(R.string.name),
                        degree = stringResource(R.string.degree)
                    )
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
            .safeDrawingPadding()
            .padding(10.dp)
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .offset(y = (-40).dp),
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
                        width = 2.dp, color = Color.White, shape = RoundedCornerShape(10.dp)
                    )
            )
            Text(
                text = name, fontSize = 32.sp, modifier = Modifier.padding(top = 10.dp)

            )
            Text(
                text = degree,
                fontSize = 20.sp,
            )
        }

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(10.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            detailBox(
                Icons.Rounded.Phone,
                stringResource(R.string.phoneN),
                "tel:${stringResource(R.string.phoneN)}"
            )
            detailBox(Icons.Rounded.Share, stringResource(R.string.connectName), "https://instagram.com/${stringResource(R.string.connectName)}")
            detailBox(
                Icons.Rounded.Email,
                stringResource(R.string.email),
                "mailto:${stringResource(R.string.email)}"
            )
        }
    }
}

@Composable
fun detailBox(icon: ImageVector, text: String, uri: String) {
    var uri: Uri = uri.toUri()
    val context = LocalContext.current
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {

        Button(modifier = Modifier.width(220.dp),
            onClick = {
            val intent = Intent(
                Intent.ACTION_VIEW, uri
            )
            context.startActivity(intent)
        }) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(icon, null)
                Spacer(Modifier.width(15.dp))
                Text(text)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    P1_TarjetaPresentacion_Alonso_Lorenzo_Jonathan_Javier_CalvaTheme {
        BusinessCard(name = "Alonso Y Jonathan", degree = "Software developers")
    }
}