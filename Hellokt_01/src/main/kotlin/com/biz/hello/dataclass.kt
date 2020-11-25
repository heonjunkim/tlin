package com.biz.hello




// 내부적으로 생성자, getter , setter, Tosting을 기본적으로 만들어지고
// equals(), hashCode(), copy(), component()메서드가 생성
data class BookVO(var title : String, var author : String, var comp : String, var price : Int)
data class UserVO(var name : String, var tel : String , var age : Int)


fun main() {
    // 생성자가 변수타입만 지정된 데이터 클래스는 빈 값으로 객체를 생성할 수 없다
    var bookVO = BookVO("자바야 놀자","고길동","이지",15000)
    bookVO.title= "오라클"
    println(bookVO.toString())
    println(bookVO.hashCode())
    // 데이터 클래스를 빈 값으로 객체로 생성하려면 클래스 선언문에 default값이 지정되어 있어야 한다
    var userVO = UserVO()
    println(userVO.toString())
    println(userVO.hashCode())
    println("userVO야 너는 UserVO 클래스로부터 만들어진 객체이냐? "+
    "$(if(userVO.equals(UserVO()))"  "맞아" else "아니" )


    var userVO1 = UserVO(name="이몽", age=33)
    var bookVO1 = BookVO(author = "춘향",title = )

    var userVOCopy = userVO.copy(name="임꺽정")
    println(userVO.copy.toString())





}

class StaticClass {
    companion object NAVER_KEY {
        var ID = "1234567"
        var SECURITY = "00111000"
    }
}

class Daum_config {
    companion object {
        var SEC_ID = "0001"
        var SEC_VALUE= 1111
    }
}
fun daum() {
    println(Daum_config.SEC_ID)
    println(Daum_config.SEC_VALUE)
}