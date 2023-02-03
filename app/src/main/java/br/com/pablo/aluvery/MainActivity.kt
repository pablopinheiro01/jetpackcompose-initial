package br.com.pablo.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pablo.aluvery.model.Product
import br.com.pablo.aluvery.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    ProductSectionPreview()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ProductSectionPreview() {
    ProductSection()
}

@Composable
fun ProductSection() {
    Column() {
        Text(
            text = "Promoções",
            Modifier.padding(start = 16.dp, top = 16.dp, bottom = 16.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight(400)
        )
        Row(
            Modifier
                .padding(
                    top = 8.dp,
                    bottom = 16.dp
                )
                .fillMaxWidth()
                .horizontalScroll(
                    state = rememberScrollState()
                ),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Spacer(modifier = Modifier)
            ProductItem(Product("Hamburguer",22.99.toBigDecimal().toBrazilianCurrency(),R.drawable.burger))
            ProductItem(Product("Pizza",80.00.toBigDecimal().toBrazilianCurrency(),R.drawable.pizza))
            ProductItem(Product("Batata Frita",20.00.toBigDecimal().toBrazilianCurrency(), R.drawable.fries))
            Spacer(modifier = Modifier)
        }
    }
}

@Preview()
@Composable
fun ProductItemPreview() {
    ProductItem(Product(name = LoremIpsum(50).values.first(), price = 14.99.toBigDecimal().toBrazilianCurrency(), R.drawable.ic_launcher_background))
}

@Composable
fun DescriptionProductItem(desc: String) {
    Text(
        modifier = Modifier
            .background(color = Purple500)
            .padding(8.dp),
        text = desc,
        color = Color.White
    )
}

@Composable
fun ProductItem(product: Product) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp,
    ) {
        Column(
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
                .verticalScroll(
                    rememberScrollState()
                )
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
                    painter = painterResource(id = product.image),
                    contentDescription = "teste",
                    modifier = Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(shape = CircleShape)
                        .align(BottomCenter),
                    contentScale = ContentScale.Crop
                )
            }
            Spacer(modifier = Modifier.height(imageSize / 2))
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    modifier = Modifier.padding(top = 8.dp),
                    text = product.price,
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400)
                )
            }
        }
    }
}

