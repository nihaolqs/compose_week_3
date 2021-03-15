package com.example.androiddevchallenge

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.pink100

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme() {
                WelcomeView()
            }
        }
    }
}

@Composable
private fun WelcomeView() {

    Surface(color = pink100, modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()) {
        Image(painterResource(id = R.drawable.light_welcome_bg),
            contentDescription = "",
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight())
        Column() {
            Image(
                painter = painterResource(id = R.drawable.light_welcome_illos),
                contentDescription = "",
                modifier = Modifier
                    .padding(top = 72.dp, start = 88.dp)
                    .width(310.dp)
                    .height(280.dp)
            )

            Image(painter = painterResource(id = R.drawable.light_logo),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 48.dp))
        }


    }
}

@Preview
@Composable
private fun PreWelcomeView() {
    WelcomeView()
}