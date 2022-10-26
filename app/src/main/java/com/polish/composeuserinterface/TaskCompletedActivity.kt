package com.polish.composeuserinterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.polish.composeuserinterface.ui.theme.ComposeUserInterfaceTheme

class TaskCompletedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUserInterfaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TaskCompletedView()
                }
            }
        }
    }
}

@Composable
fun TaskCompletedView() {

    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(90.dp))
        val image = painterResource(id = R.drawable.ic_task_completed)
        Image(
            painter = image,
            contentDescription = null
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "All tasks completed",
            fontSize = 24.sp,
            modifier = Modifier.fillMaxWidth().fillMaxWidth().wrapContentWidth(align = Alignment.CenterHorizontally)
        )
        Text(
            text = "Nice work!",
            fontSize = 24.sp,
            modifier = Modifier.fillMaxWidth().fillMaxWidth().wrapContentWidth(align = Alignment.CenterHorizontally)
        )
    }
}

@Composable
fun Greeting3(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    ComposeUserInterfaceTheme {
        TaskCompletedView()
    }
}
