package com.ant.kotlin

fun checkC(c: Char) = c in 'a'..'d';

fun checkCNotIn(c: Char) = c !in 'a'..'d';

fun recognize2(c: Char) = when (c) {
	in '0'..'9' -> "It's a digit!" // 1 �ж�ֵ�Ƿ���0��9�ķ�Χ��
	in 'a'..'z', in 'A'..'Z' -> "It's a letter!" // 2 ����Ժϲ������Χ
	else -> "I don't know��"
}

fun main(args: Array<String>) {
	println(checkC('c'));
	println(checkC('z'));
	println(checkCNotIn('z'));
	println(recognize2('1'))
}