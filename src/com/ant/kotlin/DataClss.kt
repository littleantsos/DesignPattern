package com.ant.kotlin

//��Kotlin�У���Ӧ�þ���ʹ�� val �������еı������������Ҫ��ʱ�� val ��
//Ϊ var ��ʹ�ò��ɱ����á����ɱ����ͺ���û�и����ã�������Ĵ�����ӽӽ�����ʽ��
//��
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


//ֻ�б��ʽ������������Է���ֵ��
fun max2(a: Int, b: Int) : Int = if(a > b) a else b;

fun max3(a: Int, b: Int) = if(a > b) a else b;

