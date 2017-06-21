package com.ant.kotlin

fun throwExceptionDemo(i: Int){
	if(i in 1..9){
		println(i)
	} else
		throw IllegalArgumentException("not illegal arg $i")
}

fun main(args: Array<String>) {
	try{
		throwExceptionDemo(10)
	}catch(e: IllegalArgumentException){
		println("Exception")
		e.printStackTrace()
	}
	
}