package com.example.jetpackcomposebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposebasics.ui.theme.JetpackComposeBasicsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeBasicsTheme {
              Surface(
                  modifier = Modifier.fillMaxSize(),
                  color = Color.LightGray
              ) {
                  GreetingText(
                      message = "We love you Ketaki",
                      from = "Harsha & Kaveri",
                      modifier = Modifier.padding(10.dp)
                  )
              }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = "$message",
            fontSize = 100.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = "From $from",
            fontSize = 40.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.End,
            modifier = Modifier.paddingFromBaseline(80.dp)
        )
    }


}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CardPreview() {
    JetpackComposeBasicsTheme {
        GreetingText(
            message = "We love you Ketaki",
            from = "Harsha & Kaveri",
            modifier = Modifier.padding(8.dp)
            )
    }
}



