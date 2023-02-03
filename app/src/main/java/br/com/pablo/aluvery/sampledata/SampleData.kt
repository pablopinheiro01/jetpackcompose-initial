package br.com.pablo.aluvery.sampledata

import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import br.com.pablo.aluvery.R
import br.com.pablo.aluvery.model.Product
import br.com.pablo.aluvery.toBrazilianCurrency


val sampleProducts: List<Product> = listOf(
    Product(
        "Hamburguer",
        22.99.toBigDecimal().toBrazilianCurrency(),
        R.drawable.burger,
        LoremIpsum(50).values.first()
    ),

    Product(
        "Pizza",
        80.00.toBigDecimal().toBrazilianCurrency(),
        R.drawable.pizza
    ),
    Product(
        "Batata Frita",
        20.00.toBigDecimal().toBrazilianCurrency(),
        R.drawable.fries
    )

)