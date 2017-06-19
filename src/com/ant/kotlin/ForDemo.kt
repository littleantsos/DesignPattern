package com.ant.kotlin
import java.util.TreeMap 

fun main(args: Array<String>) {
	for(i in 100 downTo(1) step(1)){
		println(fizzBuzz(i))
	}
	
	set();
}

fun fizzBuzz(i: Int) =  when{
	i % 15 == 0 -> "fizz buzz"
	else -> "$i"
}

fun set(){
	val binaryReps = TreeMap<Char, String>() // 1 使用了TreeMap，因此键值是有序的
	for (c in 'A'..'F') { // 2 使用字符范围，从A到F遍历字符
	val binary = Integer.toBinaryString(c.toInt()) // 3 把ASCII编码转换成二进制
	binaryReps[c] = binary // 4 以c为键把数值保存在映射集
	}
	for ((letter, binary) in binaryReps) { // 5 遍历一个映射集，吧映射的键跟值分配给两个变量
	println("$letter = $binary")
	}
}
