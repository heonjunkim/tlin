package com.biz.hello

fun main() {

    var str1 : String = "Korea"
    var str2 : String = "korea"

    //문자열 값으로 비교하기
    if(str1 == str2) {
        println("같은 문자열 입니다")
    }
    // 레퍼런스 비교
    if(str1 === str2) {
        println("주소가 다를 수 잇습니다")
    }

    var num1 = 10
    var num2 = 20

    // num1과 num2 중 큰값찾기
    var max1 = num1
    if(num1 < num2) max1 = num2

    // KT의 3항 연산
    //  num1 > num2 ? num1 : num2
    max1 = if(num1 > num2) num1 else num2

    // num1과 num2의 크기를 비교한 후
    // 어떤 연산을 수행하고 그 결과를 max1에 담고 싶을때
    max1 = if(num1 > num2) {
        println("응 아니야~")
        num1
    } else {
        println("응 맞아~")
        num2
    }
    var num3 = 3
    when(num3) {
        1 -> println("num3 = 1")
        2 -> println("num3 = 1")
        3 -> println("num3 = 1")
        4 -> println("num3 = 1")
        else -> println("없음")
    }
    var rNum : Int = (Math.random() * 100 + 1).toInt()
    when(rNum) {
        1 -> println("rNum은 1")
        in 10..20 -> println("rNum은 10부터 20중 하나 $rNum")
        in 21..31 -> println("rNum은 21부터 31중 하나 $rNum")
        else -> println("어디에도 속하지 않는다")
    }

    var arrInt = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    rNum = (Math.random() * 20 +1).toInt()
    when(rNum){
        in arrInt -> println("arrInt 배열에 포함된 값")
    }

    // any 모든 자료형
    var xVar : Any = "Republic of Korea"
    var x = when(xVar) {
        is String -> xVar.indexOf("Korea") > 0 // 문자열이 포함되어 있나?
        is String -> xVar.startsWith("of") // 시작하는 문자열이 of 이냐?
        else -> false
    }
    println("$xVar 에는 Korea 문자열이 ${if(x) "포함되었음" else "포함되지않음" }")
}