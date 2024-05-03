package com.example.ecommerceapp.feature_.presentation.ecom_home.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.ecommerceapp.core.presentation.components.BarColor
import com.example.ecommerceapp.core.presentation.components.Slider
import com.example.ecommerceapp.feature_.presentation.ecom_home.HomeViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "UnrememberedMutableState")
@Composable
fun HomeScreen(
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state = viewModel.state.value
    val videoUri = "https://fullstack.edu.vn/landing/htmlcss/assets/video/sass-auto-compile.mp4"


    LaunchedEffect(key1 = true){
        viewModel.getPostsByCategory()
    }


    BarColor()

    Scaffold() {  it ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
                if (state.isLoading) {
                    CircularProgressIndicator(
                        modifier = Modifier
                            .size(80.dp)
                            .align(Alignment.Center),
                        color = MaterialTheme.colorScheme.primary
                    )
                } else {
                    Column (
                        modifier = Modifier
                            .padding(top = 64.dp, bottom = 56.dp)
                            .fillMaxSize(),
                    ) {
                    Slider()
                    Spacer(modifier = Modifier.height(30.dp))

                    Category(
                        postItemList = state.webItems,
                        text = "Web Development"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Category(
                        postItemList = state.mobileItems,
                        text = "Mobile Development"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Category(
                        postItemList = state.gameItems,
                        text = "Game Development"
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Text(
                        text = "Video Nổi Bật",
                        modifier = Modifier.align(Alignment.CenterHorizontally),
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.titleLarge
                    )
                    Spacer(modifier = Modifier.height(24.dp))
                    ExoPlayerView(videoUri)

                    Spacer(modifier = Modifier.height(20.dp))
                    aside()

                }
            }
        }
    }

}