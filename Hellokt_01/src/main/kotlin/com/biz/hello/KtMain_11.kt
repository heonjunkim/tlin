package com.biz.hello

fun main() {
    var sum = ad( 100,200)
    println(sum)

    println(ad(3.5F,4.5F))
    println(ad("Korea","대한민국"))

}

fun ad(num1 : Int, num2 : Int) : Int {
    return num1 + num2
}
fun ad(num1 : Float, num2 :Float) : Float {
    return num1 + num2
}

fun ad(str1:String, str2:String) :String {
    return str1 + str2
}