package com.biz.hello

import java.util.*

fun main() {
    val scan = Scanner(System.`in`)

    print("구의 반지름 >>")
    val strOne = scan.nextLine()
    val One = strOne.toDouble()

    // 구의 면적
    val area : Double = One * Math.PI * 4.0;

    // 구의 부피
    val  volume : Double = (One * One) * (4/3).toDouble() * Math.PI

    println("반지름이 $One 인 구의 면적 : $area, 부피 : $volume")

}