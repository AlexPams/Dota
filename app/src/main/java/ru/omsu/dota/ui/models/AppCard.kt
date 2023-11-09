package ru.omsu.dota.ui.models

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import ru.omsu.dota.R
import ru.omsu.dota.ui.theme.skModernistFamily


@Composable
fun AppCard() {
    val comments = listOf(
        Comment(),
        Comment(),
        Comment(),
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {

        Image(
            painter = painterResource(id = R.drawable.dotabanner),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxSize(),
            alignment = Alignment.TopCenter

        )
        Column(
            modifier = Modifier
                .padding(0.dp, 290.dp, 0.dp, 0.dp)
                .background(
                    color = colorResource(R.color.surface),
                    shape = RoundedCornerShape(
                        topStart = 25.dp,
                        topEnd = 25.dp
                    )
                )
                .padding(24.dp, 0.dp, 24.dp, 25.dp)
        ) {
            Column(

            ) {
                Row(
                    modifier = Modifier
                        .offset(
                            y = -20.dp,
                            x = 0.dp
                        ),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.Top
                    ) {
                        Box(
                            modifier = Modifier
                                .size(88.dp)
                                .clip(shape = RoundedCornerShape(25.dp))
                                .background(color = Color.Black)
                                .border(BorderStroke(2.dp, Color.Gray))
                                .border(
                                    width = 2.dp,
                                    color = Color.Gray,
                                    shape = RoundedCornerShape(25.dp)
                                ),
                            contentAlignment = Alignment.Center,


                            ) {
                            Image(
                                painter = painterResource(id = R.drawable.dotaicon),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(54.dp)
                            )
                        }
                    }
                    Column(
                        modifier = Modifier.padding(0.dp, 34.dp, 0.dp, 16.dp),
                        verticalArrangement = Arrangement.spacedBy(7.dp)
                    ) {
                        Text(
                            text = stringResource(R.string.dota2),
                            fontFamily = skModernistFamily,
                            fontWeight = FontWeight(700),
                            fontSize = 20.sp,
                            color = Color.White
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.ic_five_stars),
                                contentDescription = "",
                                modifier = Modifier
                                    .height(12.dp)
                                    .width(74.dp)
                            )

                            Text(
                                text = stringResource(R.string.count),
                                fontFamily = skModernistFamily,
                                fontWeight = FontWeight(400),
                                fontSize = 12.sp,
                                color = Color.LightGray
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp)
                ) {
                    Category(stringResource(R.string.tag_one))
                    Category(stringResource(R.string.tag_two))
                    Category(stringResource(R.string.tag_three))
                }
                Spacer(modifier = Modifier.height(30.dp))
                Box {
                    Text(
                        text = stringResource(R.string.description),
                        color = Color.White.copy(alpha = 0.7f),
                        fontFamily = skModernistFamily,
                        fontWeight = FontWeight(400),
                        fontSize = 12.sp,
                    )
                }
                Spacer(modifier = Modifier.height(15.dp))
                Row(
                    modifier = Modifier
                        .height(135.dp)
                        .fillMaxWidth()
                        .horizontalScroll(state = ScrollState(0)),
                    horizontalArrangement = Arrangement.spacedBy(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .width(240.dp)
                            .height(135.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(alpha = 0.5f))
                                .zIndex(1f)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.dotaslide),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .fillMaxSize()
                                .zIndex(0f)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.ic_arrow___right_2),
                            contentDescription = "",
                            modifier = Modifier
                                .clip(shape = RoundedCornerShape(50.dp))
                                .background(color = Color.White.copy(alpha = 0.4f))
                                .padding(12.dp)
                                .zIndex(3f)
                        )
                    }
                    Box(
                        modifier = Modifier
                            .width(240.dp)
                            .height(135.dp)
                            .clip(shape = RoundedCornerShape(10.dp)),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(Color.Black.copy(alpha = 0.5f))
                                .zIndex(1f)
                        )
                        Image(
                            painter = painterResource(id = R.drawable.c5f9992c70089d19417df2759454fd4a),
                            contentDescription = "",
                            contentScale = ContentScale.FillBounds,
                            modifier = Modifier
                                .fillMaxSize()
                                .zIndex(0f)
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Column {
                    Text(
                        text = stringResource(R.string.review_and_ratings),
                        color = Color.White,
                        fontFamily = skModernistFamily,
                        fontWeight = FontWeight(700),
                        fontSize = 16.sp,
                    )
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "4.9",
                            color = Color.White,
                            fontFamily = skModernistFamily,
                            fontWeight = FontWeight(700),
                            fontSize = 48.sp,
                        )
                        Column(
                            verticalArrangement = Arrangement.spacedBy(8.dp)
                        ) {
                            Row {
                                Image(
                                    painter = painterResource(id = R.drawable.ic_group_98),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .height(12.dp)
                                        .width(74.dp)
                                )
                            }
                            Text(
                                text = stringResource(R.string.reviews),
                                color = Color.White,
                                fontFamily = skModernistFamily,
                                fontWeight = FontWeight(400),
                                fontSize = 12.sp,
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.height(30.dp))
                LazyColumn(
                    modifier = Modifier
                        .heightIn(0.dp, 700.dp),
                ) {
                 items(comments){comment -> Box(modifier = Modifier.padding(0.dp,25.dp)) { Comment(comment)}}
                }
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.button))
                ) {
                    Text(
                        text = stringResource(R.string.install_button),
                        color = colorResource(R.color.surface),
                        fontFamily = skModernistFamily,
                        fontWeight = FontWeight(700),
                        fontSize = 20.sp,
                    )
                }
            }
        }
    }
}
@Composable
fun Comment(comment: Comment = Comment()) {
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
                    text = comment.name,
                    color = Color.White,
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight(400),
                    fontSize = 16.sp,
                )
                Text(
                    text = comment.date,
                    color = Color.White.copy(alpha = 0.4f),
                    fontFamily = skModernistFamily,
                    fontWeight = FontWeight(400),
                    fontSize = 12.sp,
                )
            }
        }
        Text(
            color = Color.White.copy(alpha = 0.7f),
            text = comment.comment
        )
    }
}


