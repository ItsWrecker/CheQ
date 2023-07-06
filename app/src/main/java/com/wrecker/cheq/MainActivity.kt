package com.wrecker.cheq

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.intl.Locale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.toUpperCase
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.wrecker.cheq.ui.theme.CheQTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CheQTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background
                ) {
                    Scaffold(
                        topBar = {
                            TopAppBar(title = {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(end = 16.dp),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = "Welcome",
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight(600),
                                        color = Color(0xFF131414)
                                    )
                                    Row(verticalAlignment = Alignment.CenterVertically) {
                                        Card(
                                            shape = RoundedCornerShape(16.dp),
                                            modifier = Modifier.padding(5.dp, 12.dp, 5.dp, 12.dp),
                                            border = BorderStroke(1.dp, Color(0xFF5EDABF)),
                                            colors = CardDefaults.cardColors(
                                                containerColor = Color(
                                                    0xFFFFFFFF
                                                )
                                            )
                                        ) {
                                            Row(
                                                horizontalArrangement = Arrangement.spacedBy(12.dp),
                                                verticalAlignment = Alignment.CenterVertically,
                                                modifier = Modifier.padding(
                                                    start = 12.dp,
                                                    top = 4.dp,
                                                    end = 12.dp,
                                                    bottom = 4.dp
                                                )
                                            ) {
                                                Image(
                                                    modifier = Modifier.size(16.dp, 16.dp),
                                                    painter = painterResource(
                                                        id = R.drawable.chips
                                                    ),
                                                    contentDescription = "chips"
                                                )
                                                Text(
                                                    fontSize = 20.sp,
                                                    text = "4567",
                                                    color = Color(0xFF131414)
                                                )
                                            }
                                        }
                                        Image(
                                            painter = painterResource(id = R.drawable.group_184968),
                                            contentDescription = "group",
                                            modifier = Modifier.size(32.dp)
                                        )
                                    }
                                }
                            })
                        }, bottomBar = {
                            BottomAppBar(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(48.dp),
                                containerColor = Color(0xffFFFFFF)
                            ) {
                                Row(
                                    modifier = Modifier.fillMaxWidth(0.90F),
                                    verticalAlignment = Alignment.CenterVertically,
                                    horizontalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Column(
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            modifier = Modifier
                                                .offset(x = 12.5.dp, y = 0.dp)
                                                .width(24.dp)
                                                .height(24.dp),
                                            painter = painterResource(id = R.drawable.home_colour),
                                            contentDescription = "home"
                                        )
                                        Text(
                                            modifier = Modifier.offset(x = 12.5.dp, y = 0.dp),
                                            text = "Home",
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight(600),
                                            color = Color(0xFF131414),
                                            letterSpacing = 0.4.sp
                                        )
                                    }
                                    Column(
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            modifier = Modifier
                                                .offset(x = 12.5.dp, y = 0.dp)
                                                .width(24.dp)
                                                .height(24.dp),
                                            painter = painterResource(id = R.drawable.card_grey),
                                            contentDescription = "Pay"
                                        )
                                        Text(
                                            modifier = Modifier.offset(x = 12.5.dp, y = 0.dp),
                                            text = "Pay",
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight(600),
                                            color = Color(0xFF131414),
                                            letterSpacing = 0.4.sp
                                        )
                                    }
                                    Column(
                                        verticalArrangement = Arrangement.Center,
                                        horizontalAlignment = Alignment.CenterHorizontally
                                    ) {
                                        Image(
                                            modifier = Modifier
                                                .offset(x = 12.5.dp, y = 0.dp)
                                                .width(24.dp)
                                                .height(24.dp),
                                            painter = painterResource(id = R.drawable.rewards_grey),
                                            contentDescription = "rewards"
                                        )
                                        Text(
                                            modifier = Modifier.offset(x = 12.5.dp, y = 0.dp),
                                            text = "Rewards",
                                            fontSize = 10.sp,
                                            fontWeight = FontWeight(600),
                                            color = Color(0xFF131414),
                                            letterSpacing = 0.4.sp
                                        )
                                    }
                                }
                            }
                        }


                    ) { contentPadding ->
                        ConstraintLayout(
                            modifier = Modifier.padding(contentPadding)
                        ) {
                            val (dueCard, creditScore) = createRefs()
                            DueCard(modifier = Modifier.constrainAs(dueCard) {
                                top.linkTo(parent.top)
                                start.linkTo(parent.start)
                                end.linkTo(parent.end)
                            })
                            CreditScore(modifier = Modifier.constrainAs(creditScore) {
                                top.linkTo(dueCard.bottom)
                                start.linkTo(dueCard.start)
                                end.linkTo(dueCard.end)
                            })
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun CreditScore(modifier: Modifier) {
    ConstraintLayout(
        modifier
            .padding(24.dp)
            .fillMaxWidth()
            .border(1.dp, color = Color(0xFFE6EAE9), shape = RoundedCornerShape(16.dp))
            .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 16.dp))
            .fillMaxWidth()
            .padding(top = 10.dp)
            .wrapContentSize()
    ) {
        val (title, card) = createRefs()

        Text(
            text = "YOUR CREDIT SCORE",
            fontSize = 10.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF6E7170),
            letterSpacing = 0.4.sp,
            modifier = Modifier
                .constrainAs(title) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
                .fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        Card(
            modifier = Modifier
                .constrainAs(card) {
                    top.linkTo(title.bottom)
                    start.linkTo(title.start)
                    end.linkTo(title.end)
                }
                .border(1.dp, color = Color(0xFFE6EAE9), shape = RoundedCornerShape(16.dp))
                .background(color = Color(0xFFFFFFFF), shape = RoundedCornerShape(size = 16.dp))
                .fillMaxWidth()
                .padding(top = 10.dp)
                .wrapContentSize()
        ) {
            ConstraintLayout(modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)) {
                val (image, title, logo, score_left, score_right, status) = createRefs()

                Image(
                    painter = painterResource(id = R.drawable.credit_health_meter),
                    contentDescription = "credit",
                    modifier = Modifier
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            bottom.linkTo(parent.bottom)
                        }
                        .size(36.dp)
                )

                Text(
                    text = "Powered by",
                    fontSize = 10.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFFCACFCF),
                    letterSpacing = 0.4.sp,
                    modifier = Modifier.constrainAs(title) {
                        top.linkTo(image.top)
                        start.linkTo(image.end)
                    }
                )

            }
        }
    }
}


@Composable
fun DueCard(modifier: Modifier) {
    Card(
        modifier = modifier
            // .offset(x = 23.dp, y = 123.dp)
            .shadow(
                elevation = 8.dp,
                spotColor = Color(0x1F6A7381),
                ambientColor = Color(0x1F6A7381)
            )
            .padding(16.dp)
            .fillMaxWidth()


    ) {
        ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
            val (header, list, divider, button) = createRefs()
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .constrainAs(header) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Total due".uppercase(),
                    fontSize = 10.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF131414),
                    letterSpacing = 0.4.sp
                )
                Text(
                    text = "₹ 60000".uppercase(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF131414),
                    letterSpacing = 0.4.sp
                )
            }

            Divider(
                modifier = Modifier
                    .padding(12.dp)
                    .constrainAs(divider) {
                        top.linkTo(header.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    },
                color = Color(0xFFE6EAE9),
                thickness = 1.dp
            )
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
                    .constrainAs(list) {
                        top.linkTo(divider.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
            ) {
                val (image, name, dues) = createRefs()

                Image(
                    painter = painterResource(id = R.drawable.image),
                    contentDescription = "image",
                    modifier = Modifier
                        .constrainAs(image) {
                            top.linkTo(parent.top)
                        }
                        .size(24.dp)
                        .shadow(elevation = 2.dp, shape = RoundedCornerShape(4.dp))

                )
                Column(
                    modifier = Modifier
                        .wrapContentSize(align = Alignment.Center)
                        .constrainAs(name) {
                            top.linkTo(image.top)
                            bottom.linkTo(image.bottom)
                            start.linkTo(image.end)
                        }
                        .padding(start = 10.dp),
                    horizontalAlignment = Alignment.Start,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "Axis Platinum",
                        fontSize = 12.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF131414)
                    )
                    Text(
                        text = "Credit Card ",
                        fontSize = 10.sp,
                        color = Color(0xFF858989)
                    )
                }
                Column(
                    modifier = Modifier
                        .wrapContentSize()
                        .constrainAs(dues) {
                            top.linkTo(image.top)
                            bottom.linkTo(image.bottom)
                            end.linkTo(parent.end)
                        },
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "₹30,000.06",
                        fontSize = 14.sp,
                        fontWeight = FontWeight(600),
                        color = Color(0xFF131414),
                        textAlign = TextAlign.Right
                    )
                    Text(
                        text = "Overdue by 1 Day",
                        fontSize = 10.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFF5466A),
                        textAlign = TextAlign.Right
                    )
                }

            }

            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .constrainAs(button) {
                        top.linkTo(list.bottom)
                        bottom.linkTo(parent.bottom)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                    }
                    .fillMaxWidth()
                    .padding(vertical = 24.dp, horizontal = 12.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF00C197)),
                elevation = ButtonDefaults.elevatedButtonElevation()
            ) {
                ConstraintLayout(modifier = Modifier.fillMaxWidth()) {
                    val (buttonText, icon) = createRefs()

                    Text(
                        modifier = Modifier.constrainAs(buttonText) {
                            top.linkTo(parent.top)
                            start.linkTo(parent.start)
                            end.linkTo(parent.end)
                        },
                        text = "Pay now".toUpperCase(Locale.current),
                        fontSize = 12.sp,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFFFFFFF),
                        textAlign = TextAlign.Center,
                        letterSpacing = 0.36.sp
                    )

                    Row(
                        modifier = Modifier.constrainAs(icon) {
                            top.linkTo(buttonText.bottom)
                            start.linkTo(buttonText.start)
                            end.linkTo(buttonText.end)
                            bottom.linkTo(parent.bottom)
                        },
                        horizontalArrangement = Arrangement.Start,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.chips),
                            contentDescription = "chip",
                            modifier = Modifier
                                .size(14.dp)

                        )
                        Text(
                            modifier = Modifier.padding(start = 4.dp),
                            text = "Earn 1% CheQ Chips",
                            fontSize = 10.sp,
                            fontWeight = FontWeight(500),
                            color = Color(0xFFFFFFFF),
                        )
                    }

                }
            }
        }
    }
}