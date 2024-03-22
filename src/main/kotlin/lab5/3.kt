package lab5

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

fun main() {
    println(calculateDiscount(192.3234, 13.00))
}

fun calculateDiscount(price: Double, discount: Double): Double {
    val discountNumber = price * (discount / 100)
    val resultPrice = price - discountNumber
    val decimalFormat = DecimalFormat("#.##", DecimalFormatSymbols(Locale.US))
    return decimalFormat.format(resultPrice).toDouble()
}