package com.example.twitterredditclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.twitterredditclone.ui.theme.TwitterRedditCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TwitterRedditCloneTheme {
                AppNavGraph()
            }
        }
    }
}
