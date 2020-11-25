package com.biz.hello

fun main() {

    // kt에서는 자료형이 지정되지 않은 변수에 null값을 저장하면 안 된다.
    // 반드시 자료형을 지정하고 자료형 뒤에 ? 을 첨가해야 한다
    var anyVar : Int ? = null
    println(anyVar)

    // Any키워드는 모든 타입에 값을 저장할 수 있는 변수이다
    var anyVar1 : Any = 123
    anyVar1 = "korea"
    anyVar1 = 30.2F

    // any type 저장된 값의 자료형이 무엇이냐?
    when(anyVar1) {
        is String -> println("문자열형")
        is Int -> println("int 형")
        is Float -> println("float 형")
        is Double -> println("double 형")
        else -> println("ㅁㄹ..;;")
    }
}