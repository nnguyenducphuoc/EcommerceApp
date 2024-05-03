package com.example.ecommerceapp.feature_.presentation.ecom_home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ecommerceapp.core.presentation.components.RemoteImage
import com.example.ecommerceapp.feature_.domain.model.PostItem
import com.example.ecommerceapp.ui.theme.EcommerceAppTheme
import java.text.NumberFormat
import java.util.Locale

@Composable
fun PostItemCard(
    post: PostItem,
    modifier: Modifier = Modifier
) {
    val format = NumberFormat.getInstance(Locale("vi", "VN"))
    Column (
        modifier = modifier.padding(horizontal = 8.dp)
    ) {
        Card (
            modifier = modifier
                .width(270.dp)
                .height(160.dp),
            shape = RoundedCornerShape(24.dp)
        ) {
            RemoteImage(url = post.thumbnail)
        }
        Text(
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            fontSize = 18.sp,
            text = post.title,
            modifier = Modifier.padding(
                top = 10.dp,
                bottom = 5.dp
            )
        )
        Text(
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            text = format.format(post.price)+"đ"
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PostItemCardPreview() {
    EcommerceAppTheme {
        PostItemCard(
            post = PostItem(
                author = 2,
                category = "Mobile Development",
                content = "Thông tin chi tiết về dự án phát triển ứng dụng di động.",
                date = "2024-04-01",
                description = "Xây dựng ứng dụng di động cho nền tảng iOS và Android.",
                id = 1,
                price = 6000000,
                status = "active",
                thumbnail = "app_development.jpg",
                title = "Dự án phát triển ứng dụng di động"
            )
        )
    }
}