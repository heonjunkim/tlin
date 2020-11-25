package com.biz.hello

fun main() {
    var escString : String= "우리는\n" +
            "사명을\n" +
            "죽어서"

    var raanString : String = """
        dfdf
        dfsdfsd
        fsdf
        sdfsfd
        dsffsd
   """.trimIndent() ""

    println(raanString) // 여백 까지 보이는 그대로
    println(raanString.trimIndent()) // 여백을 제거하고

    var rawIntentString: String ="""
        dfdf
        dfsdfsd
        fsdf
        sdfsfd
        dsffsd
    """

    println(rawIntentString.trimMargin(":"))


    // kt는 문자열을 Char 배열과 동일하게 취급한다
    // 문자열변수에 첨자를 부착하여 사용하면 문자를 추출해 낼 수 있다
    var strArray = "Republic of Korea"
    println(strArray[3]) // 배열처럼
    println(strArray.get(4)) // get method를 통해서
    println(strArray.length) // 문자열길이

    for(i in 0..strArray.length -1) {
        print("$strArray[i] \t")
    }

}