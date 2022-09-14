package com.example.kotlinpractice

fun main() {
    helloWorld()
    println(add(3,4))

    //3. String Template

    val name = "Joyce"
    val lastname = "Hong"
    println("my name is ${name + lastname} i'm 23")
    //$나 ${}을 통해 변수를 템플릿으로 처리한다
    println("this is 2\$")
    println( "is this True? ${1==0}") // false 뱉어냄

    println(maxBy2(7, 9))
    checkNum(1)
}

//1. 함수

fun helloWorld(): Unit {
    println("hello world")
}

fun add (a :Int , b :Int) : Int {
    return a+b
}

//2. vla vs var

fun hi() {
    val a : Int = 10 // val은 상수
    var b : Int = 9 // var 은 변수
    var name =  "joyce"
}

//4. 조건식
fun maxBy( a:Int , b:Int ) : Int {
    if (a>b){
        return a
    } else {
        return b
    }
}

fun maxBy2( a:Int , b:Int ) = if(a>b) a else b

fun checkNum ( score : Int){
    when (score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2, or 3")
        else -> println("i dont know")
    }

    var b =  when (score){
        1->1
        2->2
        else -> 3
    }

    println("b : ${b}" )
    println(b)

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad!")
        else -> println("Okay")
    }
}

//Expression vs Statement
//무언갈 return 하면 Expression ex) 함수
//단순히 선언 하는것은 Statement (명령 지시 문장)

// 5. Array and List

//Array
//1. List 2. MutableList (arrayListof)

fun array () {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d", 3.4f)
    val list2 = listOf(1, "c", 5L)

    array[0] = 3
    //list[0] = 3 List는 변경불가
    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}