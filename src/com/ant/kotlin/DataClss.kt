package com.ant.kotlin

//在Kotlin中，你应该尽量使用 val 声明所有的变量。仅在你必要的时候将 val 改
//为 var 。使用不可变引用、不可变对象和函数没有副作用，这让你的代码更加接近函数式风
//格
data class Person(var name: String? = null,
				  var age: Int){
	fun changeAge(age: Int){
		this.age = age;
	}
}


fun main(args: Array<String>) {
	println("demo2")
	val user = User(12,"zhangsan",false);
	

	val m = Person("houhualiang",11)
	m.age = 14
	m.changeAge(15)
	println("demo2 " + m.age)
	
	println(max(111,233))
	println(max2(111,2332))
}

fun max(a: Int, b: Int): Int{
	if(a > b)
		return a;
	else return b;
}


//只有表达式函数才允许忽略返回值。
fun max2(a: Int, b: Int) : Int = if(a > b) a else b;

fun max3(a: Int, b: Int) = if(a > b) a else b;

