package com.biz.hello

fun main() {

    // 함수 내부에 선언된 지역 함수
    // 어떤 변수에 여러가지 연산을 수행한 후 그 결과를 담아야 할 경우
    // 함수를 선언하면 묶인 그룹이 명확해지는 효과
    fun privatesum() : Int {
        return 20 + 30


    println(privatesum().toString())

        fun privatesum(num1 :Int, num2 : Int) = num1 + num2
        println(privatesum(30,40))

    }
}
