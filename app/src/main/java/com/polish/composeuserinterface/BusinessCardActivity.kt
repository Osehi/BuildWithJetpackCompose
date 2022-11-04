package com.polish.composeuserinterface

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.polish.composeuserinterface.ui.ui.theme.ComposeUserInterfaceTheme

class BusinessCardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUserInterfaceTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    NameOfBrand()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
}

@Composable
fun NameOfBrand() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(painter = painterResource(id = R.drawable.ic_android_logo), contentDescription = null)
        Text(
            text = stringResource(id = R.string.business_name),
            fontSize = 32.sp
        )
        Text(
            text = stringResource(id = R.string.business_name_motto),
            fontSize = 12.sp,
            color = Color.Green,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ContactOfBrand() {
}

@Composable
fun Greeting5(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    ComposeUserInterfaceTheme {
        NameOfBrand()
    }
}
