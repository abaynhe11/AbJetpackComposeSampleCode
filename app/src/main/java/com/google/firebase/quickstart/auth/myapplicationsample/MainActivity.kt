package com.google.firebase.quickstart.auth.myapplicationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.quickstart.auth.myapplicationsample.ui.theme.MyApplicationSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    app()
                }
            }
        }
    }
}
@Composable
fun app() {
    setupStateUsingState()
}
@Composable
private fun setupStateUsingState() {
    val counter = Counter()
    Column {
        TopAppBar(
            title = { Text(text = "State Management") }
        )

        Text(
            text = counter.value.toString()
        )
        Button(onClick = {
            counter.value += 5
        }) {
            Text(text = "Click to Add 5")
        }
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationSampleTheme {
        app()
    }
}