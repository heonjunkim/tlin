package com.biz.hello

/**
 * kotlin에서의 클래스
 */
class Standard(data : Int) {}
class Standard1 private constructor(data:Int) {}

class Empty
class Empty1 private constructor() {}
class PropertyClass(val firName : String , val lastName: String) {}
fun main() {
    var st = Standard(20)
    var em = Empty()
}
