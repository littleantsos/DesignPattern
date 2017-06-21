package strings

//扩展函数  是声明在类的外部的，是一个静态的
//注意  如果基类和子类都声明了一个扩展函数，这两个扩展函数是无关的
fun String.expandHa(): String {
	return "expandHa"
}

//扩展属性
val String.ExpandHa2: Char
	get() = get(length - 1)

fun main(args: Array<String>) {
	println("hahha".expandHa())
	println("hahha".ExpandHa2)
	var s = StringBuilder("wocao,替换最后一个")
	s.replaceLstChar = '!'
	println(s)
}

var StringBuilder.replaceLstChar: Char
	get() = get(length - 1)
	set(value: Char) {
		this.setCharAt(length - 1, value)
	}