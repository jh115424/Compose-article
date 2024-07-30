package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeText(
                        name = "Android",


                        )

                }
            }
        }
    }

    @Composable
    fun ComposeText(name: String, modifier: Modifier = Modifier) {
        val image = painterResource(R.drawable.bg_compose_background)
        Box(modifier) {
         Image(
             painter = image,
             contentDescription = null,
             modifier = modifier
                 .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
         )
        }
        Text(
            text = "Hello $name!",
            fontSize = 24.sp,
            modifier = modifier
                .padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)
        )
    }

    @Composable
    fun BodyText(name: String, modifier: Modifier = Modifier ) {


    }





    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeArticleTheme {
            ComposeText("Android")
        }
    }
}