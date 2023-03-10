package br.com.pablo.aluvery.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.pablo.aluvery.ui.theme.Purple200
import br.com.pablo.aluvery.ui.theme.Purple700
import br.com.pablo.aluvery.ui.theme.Teal200


//comentado para nao ficar quebrando o cod
//@Preview
//@Composable
//fun DesafioNumberTwo() {
//    Surface {
//        Row(
//            Modifier
//                .widthIn(250.dp, 400.dp)
//                .height(200.dp)
//        ) {
//            val imageSize = 100.dp
//            Box(
//                Modifier
//                    .width(imageSize)
//                    .background(
//                        brush = Brush.verticalGradient(colors = listOf(Purple200, Teal200)),
//                    )
//                    .fillMaxHeight()
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentDescription = "teste",
//                    modifier = Modifier
//                        .size(imageSize)
//                        .offset(x = imageSize / 2)
//                        .border
//                            (
//                            width = 2.dp,
//                            brush = Brush.horizontalGradient(colors = listOf(Purple700, Teal200)),
//                            shape = CircleShape
//                        )
//                        .clip(shape = CircleShape)
//                        .align(Alignment.Center)
//                )
//            }
//            Spacer(modifier = Modifier.width(imageSize/2))
//            Text(
//                text = LoremIpsum(words = 50).values.first(),
//                modifier = Modifier.padding(18.dp),
//                fontSize = 18.sp,
//                fontWeight = FontWeight(700),
//                maxLines = 6,
//                overflow = TextOverflow.Ellipsis
//            )
//        }
//    }
//}

@Preview(showBackground = true)
@Composable
fun DesafioNumberOne() {
    Row(Modifier.fillMaxWidth().height(150.dp)) {
        Box(Modifier.background(color = Color.Blue).fillMaxHeight().width(100.dp))
        Column() {
            Text(text = "Test 1", Modifier.background(Color.Gray).fillMaxWidth().padding(16.dp))
            Text(text = "Test 2", Modifier.padding(16.dp))
        }
    }
}


@Composable
fun MyFirstComposable(){
    Text(text="Teste da primeira linha")
    Text(text="Teste da segunda linha com texto maior")
}


@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text("Texto 1")
        Text("Texto 1")
        Text("Texto 1")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto 1")
        Text(text = "Texto 1")
        Text(text = "Texto 1")
    }
}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Texto 1")
        Text(text = "Texto 1")
        Text(text = "Texto 1")
        Text(text = "Texto 1")
    }
}

@Preview(showBackground = true)
@Composable
fun PrevToCustomLayout() {
    Column(modifier = Modifier
        .background(color = Color.Blue)
        .padding(all = 8.dp)
        .fillMaxWidth()
    ) {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
        Row(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .background(color= Color.Gray)
        ) {
            Text(text = "Texto 3")
            Text(text = "Texto 4")
        }
        Box(
            modifier = Modifier
                .padding(horizontal = 8.dp, vertical = 8.dp)
                .background(color= Color.Red)
        ){
            Text(text = "Texto 6")
            Text(text = "Texto 7")
        }
    }
}