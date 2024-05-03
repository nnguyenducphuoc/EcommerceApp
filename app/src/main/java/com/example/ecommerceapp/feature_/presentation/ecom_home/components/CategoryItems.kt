package com.example.ecommerceapp.feature_.presentation.ecom_home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerceapp.feature_.domain.model.PostItem


@Composable
fun Category(
    postItemList: List<PostItem>,
    text: String,
    modifier: Modifier = Modifier
){
    Column {
        Row (
            modifier = Modifier.padding(start = 12.dp)
        ) {
            Text(
                text = text,
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.titleLarge
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                color = MaterialTheme.colorScheme.onPrimary,
                text = "MỚI",
                modifier = Modifier.background(
                    shape = RoundedCornerShape(8.dp),
                    color = MaterialTheme.colorScheme.primary
                )
                    .padding(4.dp),
                fontSize = 8.sp,
                fontWeight = FontWeight.Bold,
            )
        }

        Spacer(modifier = Modifier.height(24.dp))
        LazyRow(
            contentPadding = PaddingValues(horizontal = 4.dp),
        ) {
            items(postItemList) { item ->
                PostItemCard(post = item)
            }
        }
    }
}