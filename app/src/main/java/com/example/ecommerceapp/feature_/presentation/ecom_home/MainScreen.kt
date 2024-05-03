package com.example.ecommerceapp.feature_.presentation.ecom_home

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.ecommerceapp.feature_.presentation.ecom_home.components.BottomBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(

        topBar = {
        Column {
            CenterAlignedTopAppBar(
                title = {},
                actions = {
                    Column {
                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            IconButton(
                                onClick = { /*TODO*/ }
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Menu,
                                    contentDescription = ""
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .weight(1f)
                                    .padding(end = 12.dp),
                                horizontalArrangement = Arrangement.End
                            ) {
                                IconButton(
                                    onClick = { /*TODO*/ },
                                ) {
                                    Icon(
                                        imageVector = Icons.Default.Search,
                                        contentDescription = ""
                                    )
                                }

                                IconButton(
                                    modifier = Modifier
                                        .background(
                                            shape = RoundedCornerShape(20.dp),
                                            color = MaterialTheme.colorScheme.primary,
                                        )
                                        .width(width = 100.dp)
                                        .height(30.dp)
                                        .align(Alignment.CenterVertically),
                                    onClick = { /*TODO*/ },
                                    colors = IconButtonDefaults.iconButtonColors(),
                                ) {
                                    Text(
                                        text = "Đăng ký",
                                        color = MaterialTheme.colorScheme.onPrimary,
                                        fontWeight = FontWeight.Bold
                                    )
                                }
                            }
                        }

                    }
                },
                scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState()),
            )
            Divider(color = MaterialTheme.colorScheme.outline)
        }
    },
        bottomBar = { BottomBar(navController = navController) }
    ) { it ->
        BottomNavGraph(navController = navController)
    }
}

