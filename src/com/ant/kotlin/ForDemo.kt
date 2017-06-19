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
	val binaryReps = TreeMap<Char, String>() // 1 ʹ����TreeMap����˼�ֵ�������
	for (c in 'A'..'F') { // 2 ʹ���ַ���Χ����A��F�����ַ�
	val binary = Integer.toBinaryString(c.toInt()) // 3 ��ASCII����ת���ɶ�����
	binaryReps[c] = binary // 4 ��cΪ������ֵ������ӳ�伯
	}
	for ((letter, binary) in binaryReps) { // 5 ����һ��ӳ�伯����ӳ��ļ���ֵ�������������
	println("$letter = $binary")
	}
}
