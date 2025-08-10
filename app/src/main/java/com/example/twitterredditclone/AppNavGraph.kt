package com.example.twitterredditclone

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "auth") {
        composable("auth") { /* TODO: AuthScreen */ }
        composable("home") { /* TODO: HomeScreen */ }
        composable("create") { /* TODO: CreatePostScreen */ }
        composable("post/{postId}") { /* TODO: PostDetailScreen */ }
    }
}
