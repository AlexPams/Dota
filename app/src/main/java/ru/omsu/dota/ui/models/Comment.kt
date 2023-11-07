package ru.omsu.dota.ui.models

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.omsu.dota.R
import ru.omsu.dota.ui.theme.skModernistFamily

@Composable
fun Comment(name: String, date: String, text: String) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(38.dp)
                    .clip(shape = RoundedCornerShape(50.dp))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.aug),
                    contentDescription = "",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                )
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(7.dp)
            ) {
                Text(
                    text = "Auguste Conte",
                    color = Color(0xFFA8ADB7),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                )
                Text(
                    text = "February 14, 2019",
                    color = Color(0xFFA8ADB7).copy(alpha = 0.4f),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight(400),
                    fontSize = 12.sp,
                )
            }
        }
        Text(
            color = Color(0xFFEEF2FB).copy(alpha = 0.7f),
            text = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    }
}
