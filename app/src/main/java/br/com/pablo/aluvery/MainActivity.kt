package br.com.pablo.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pablo.aluvery.ui.theme.AluveryTheme
import br.com.pablo.aluvery.ui.theme.Purple500
import br.com.pablo.aluvery.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProductItem() {
    Column(
        Modifier
            .height(250.dp)
            .width(200.dp)
    ) {
        Box(
            Modifier
                .height(100.dp)
                .background(
                    brush = Brush.horizontalGradient(colors = listOf(Purple500, Teal200)),
                )
                .fillMaxWidth()
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "teste",
                modifier = Modifier
                    .size(100.dp)
                    .offset(y = 50.dp)
                    .clip(shape = CircleShape)
                    .align(BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        Column(Modifier.padding(16.dp)) {
            Text(
                text = LoremIpsum(50).values.first(),
                fontSize = 18.sp,
                fontWeight = FontWeight(700),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text(modifier = Modifier.padding(top = 8.dp), text = "R$ 14,99", fontSize = 14.sp, fontWeight = FontWeight(400))
        }
    }

}
