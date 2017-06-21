package com.ant.kotlin

fun checkC(c: Char) = c in 'a'..'d';

fun checkCNotIn(c: Char) = c !in 'a'..'d';

fun recognize2(c: Char) = when (c) {
	in '0'..'9' -> "It's a digit!" // 1 判断值是否在0到9的范围内
	in 'a'..'z', in 'A'..'Z' -> "It's a letter!" // 2 你可以合并多个范围
	else -> "I don't know…"
}

fun main(args: Array<String>) {
	println(checkC('c'));
	println(checkC('z'));
	println(checkCNotIn('z'));
	println(recognize2('1'))
}