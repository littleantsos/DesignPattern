package com.ant.kotlin

import com.ant.kotlin.Person
import com.ant.design.pattern.structure.hello

class Rectangle(val width: Int, val height: Int) {

	val isRectAngle: Boolean
		get() {
			return width == height
		}
}

fun main(args: Array<String>){
	val rect = Rectangle(10,10);
	println(rect.isRectAngle)
	
	val demo = Person("xx",123)
	println(hello("kx"))
}