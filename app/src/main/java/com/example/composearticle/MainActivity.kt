package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import androidx.compose.foundation.Image
import androidx.compose.foundation.border

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight


import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
                    modifier = Modifier.fillMaxHeight(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeText(
                        name = "Jetpack Compose Tutorial",
                        paragraph = "Jetpack Compose is a modern toolkit for" +
                                " building native Android UI. Compose simplifies and" +
                                " accelerates UI development on Android with less code, " +
                                "powerful tools, and intuitive Kotlin APIs.",
                        paragraphBody = "In this tutorial, you build a simple UI component" +
                                " with declarative functions. You call Compose functions to say" +
                                " what elements you want and the Compose compiler does the" +
                                " rest. Compose is built around Composable functions. These " +
                                "functions let you define your app\\'s UI programmatically " +
                                "because they let you describe how it should look and provide data " +
                                "dependencies, rather than focus on the process of the UI\\'s" +
                                " construction, such as initializing an element and then attaching" +
                                " it to a parent. To create a Composable function, you add the" +
                                " @Composable annotation to the function name."


                    )


                }
            }
        }
    }

    @Composable
    fun ComposeText(
        name: String,
        modifier: Modifier = Modifier,
        paragraph: String,
        paragraphBody: String
    ) {
        val image = painterResource(R.drawable.bg_compose_background)
        Column(modifier = Modifier) {

            Box(modifier) {

                Image(
                    painter = image,
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = modifier
                        .border(3.dp, Color.Blue)
                        .padding(start = 5.dp, end = 5.dp, bottom = 10.dp, top = 5.dp)


                )
            }
            Text(
                text = "$name!",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                modifier = modifier
                    .padding(start = 16.dp, end = 16.dp, top = 10.dp)
                    .align(alignment = Alignment.CenterHorizontally)

            )

            Text(
                text = paragraph,
                fontSize = 12.sp,
                textAlign = TextAlign.Justify,
                modifier = modifier
                    .padding(start = 16.dp, end = 16.dp, bottom = 10.dp)


            )
            Text(
                text = paragraphBody,
                fontSize = 12.sp,
                textAlign = TextAlign.Justify,
                modifier = modifier
                    .padding(start = 16.dp, end = 16.dp)

            )

        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        ComposeArticleTheme {
            ComposeText(
                name = "Jetpack Compose Tutorial",
                paragraph = "Jetpack Compose is a modern toolkit for" +
                        " building native Android UI. Compose simplifies and" +
                        " accelerates UI development on Android with less code, " +
                        "powerful tools, and intuitive Kotlin APIs.",
                paragraphBody = "In this tutorial, you build a simple UI" +
                        " component with declarative functions. You call Compose " +
                        "functions to say what elements you want and the Compose compiler" +
                        " does the rest. Compose is built around Composable functions." +
                        " These functions let you define your app\\'s UI programmatically" +
                        " because they let you describe how it should look and " +
                        "provide data dependencies, rather than focus on the process of " +
                        "the UI\\'s construction, such as initializing an element and then " +
                        "attaching it to a parent. To create a Composable function, you add " +
                        "the @Composable annotation to the function name."
            )
        }
    }
}