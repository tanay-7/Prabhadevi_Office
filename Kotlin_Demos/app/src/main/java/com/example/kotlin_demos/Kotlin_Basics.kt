package com.example.kotlin_demos

/* -----------Demo Addition and Subtraction-------------
fun main() {
fun calcAdd(a: Int, b: Int) {
println("Addition of $a and $b is ${a + b}")
}

fun calcSub(a: Int, b: Int) {
println("Subtraction of $a and $b is ${a - b}")
}

calcAdd(10, 5)
calcSub(10, 5)
}
*/

//---------------------------------------------------------

/*
fun calcArea(a: Double, b: Double): Double {
return 3 * a * b
}
*/


/*
data class TK(val name: String, val age: Int, val address: String)

fun main() {
var tk = TK("Tanay", 21, "Amsterdam")
println("Data is : $tk")
}
*/

/*
open class Parent {

}

class child : Parent() {

}
*/

//-----------------------------------------------

/*
interface Taxes {
fun stateTax(): Double;
}

class MH : Taxes {
override fun stateTax(): Double {
return 1000.00
}
}

class TL : Taxes {
override fun stateTax(): Double {
return 500.00
}
}

fun main() {
val mh=MH()
mh.stateTax()
}
*/

/*
--------------------Lambdas----------------------------
open class TK(){
init {

}
}

var lam = { a: Int, b: Int -> a + b }
*/


/*
fun main()
{
    println("tanay");
   call {
           a->
       print("hi");
       a+1}

}

fun call(l: (Int)->Int){
    l(1)
}

var add : (Int)->Int = {
    1+1
}
*/

/*
var  a ={
    println("hi")
}

var b : (Int) -> String = {
    "";
    ""
}

var c : Int= 2;*/

//--------------------------------------------------

/*
interface  I{

    fun doJob()
}

class Server {

    fun doSomething(callback:I){

        println("Server side doing something")

        callback.doJob()
    }
}




fun main(){
    Server().doSomething(object:I{
        override fun doJob() {
            print("Caller")
        }

    })

}
*/

//----------------------------------------------------
/*

fun main(){

    println("Hello".encrypt())

    println( 100.0 discount 10.0 )

    Database.isConnected
    Database.connect(c=5,b=10,a=15)

    Main.x
    Main.myStaticMethod(email="",password = "")

}


inline fun String.encrypt():String{
    return "Encrypted string is $this"
}

infix fun Double.discount(rate:Double):Double{
    return this - (this*rate/100)
}

fun greaterValue(a:Int,b:Int) = if(a>b) a else b

class Main{

    companion object {
        var x:Int = 10

        fun myStaticMethod(email:String,password:String){

        }
    }

}

interface I1{

    fun xyz()

    fun abc(){

    }

}

object Database{

    var isConnected:Boolean = false

    fun connect(a:Int,b:Int,c:Int = 0){

    }
}

*/


//-----------------------------------------------

fun main() {

    var result = doSomething(15, 3, ::add)
    var result2 = doSomething(15, 3, ::multi)
    var result3 = doSomething(15, 3, division)
    var result4 = doSomething(15, 3, { a, b -> a - b })

    doSomething(15, 3) { x, y ->
        x - y
    }

    println("Result $result")
    println("Result $result2")
    println("Result $result3")
    println("Result $result4")



    println(doStringOperation("Hello", { it.reversed() }))
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun multi(a: Int, b: Int) = a * b

val division = { a: Int, b: Int -> a / b }

fun doSomething(a: Int, b: Int, l: (Int, Int) -> Int): Int {
    return l(a, b)
}

fun doStringOperation(s: String, l: (String) -> String): String {
    return l(s.reversed())
}

/*

fun demo() {
    res.name.also
}

fun main() {
    res.name
}

object res {
    val name = "Tanay Kulkarni"
}*/
