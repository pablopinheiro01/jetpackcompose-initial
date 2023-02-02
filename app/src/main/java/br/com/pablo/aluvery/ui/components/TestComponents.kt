package br.com.pablo.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



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