package com.ant.kotlin


fun initCollections(){
	
	val set = setOf(1, 7, 53)
	val list = listOf(1, 7, 53)
	val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
	
	for((key,value) in map){
		println("$key -> $value")
	}
	
	for(value in list){
		println(value)
	}
	
	for(value in set){
		println(value)
	}
	
	println("set $set")
}

fun main(args: Array<String>) {
	initCollections()
}