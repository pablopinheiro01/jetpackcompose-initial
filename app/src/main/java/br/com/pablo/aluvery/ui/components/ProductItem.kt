package br.com.pablo.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
import br.com.pablo.aluvery.R
import br.com.pablo.aluvery.model.Product
import br.com.pablo.aluvery.toBrazilianCurrency
import br.com.pablo.aluvery.ui.theme.Purple500
import br.com.pablo.aluvery.ui.theme.Teal200

@Composable
fun ProductItem(product: Product) {
    Surface(
        shape = RoundedCornerShape(15.dp),
        elevation = 4.dp,
    ) {
        Column(
            Modifier
                .heightIn(250.dp, 255.dp)
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
                        .align(Alignment.BottomCenter),
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
            product.descricao?.let { desc ->
                Column(
                    Modifier
                ) {
                    DescriptionProductItem(desc)
                }
            }
        }
    }
}

@Preview()
@Composable
fun ProductItemPreview() {
    ProductItem(
        Product(
            name = LoremIpsum(50).values.first(),
            price = 14.99.toBigDecimal().toBrazilianCurrency(),
            image = R.drawable.placeholder
        )
    )
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