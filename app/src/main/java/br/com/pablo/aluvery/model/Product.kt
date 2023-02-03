package br.com.pablo.aluvery.model

import androidx.annotation.DrawableRes
import java.math.BigDecimal

class Product(val name: String, val price: String,  @DrawableRes val image: Int, val descricao: String? = null)

