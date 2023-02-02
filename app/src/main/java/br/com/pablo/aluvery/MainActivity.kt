package br.com.pablo.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pablo.aluvery.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
//                    ProductItem()
                    DesafioNumberTwo()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProductItem() {
    Surface(
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp
    ) {
        Column(
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
        ) {
            val imageSize = 100.dp
            Box(
                Modifier
                    .height(imageSize)
                    .background(
                        brush = Brush.horizontalGradient(colors = listOf(Purple500, Teal200)),
                    )
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "teste",
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(BottomCenter)
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = "R$ 14,99",
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }
    }
}

@Preview
@Composable
fun DesafioNumberTwo() {
    Surface {
        Row(
            Modifier
                .widthIn(250.dp, 400.dp)
                .height(200.dp)
        ) {
            val imageSize = 100.dp
            Box(
                Modifier
                    .width(imageSize)
                    .background(
                        brush = Brush.verticalGradient(colors = listOf(Purple200, Teal200)),
                    )
                    .fillMaxHeight()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "teste",
                    modifier = Modifier
                        .size(imageSize)
                        .offset(x = imageSize / 2)
                        .border
                            (
                            width = 2.dp,
                            brush = Brush.horizontalGradient(colors = listOf(Purple700, Teal200)),
                            shape = CircleShape
                        )
                        .clip(shape = CircleShape)
                        .align(Center)
                )
            }
            Spacer(modifier = Modifier.width(imageSize/2))
            Text(
                text = LoremIpsum(words = 50).values.first(),
                modifier = Modifier.padding(18.dp),
                fontSize = 18.sp,
                fontWeight = FontWeight(700),
                maxLines = 6,
                overflow = TextOverflow.Ellipsis
            )
        }
    }
}
