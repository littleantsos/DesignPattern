package strings

//��չ����  ������������ⲿ�ģ���һ����̬��
//ע��  �����������඼������һ����չ��������������չ�������޹ص�
fun String.expandHa(): String {
	return "expandHa"
}

//��չ����
val String.ExpandHa2: Char
	get() = get(length - 1)

fun main(args: Array<String>) {
	println("hahha".expandHa())
	println("hahha".ExpandHa2)
	var s = StringBuilder("wocao,�滻���һ��")
	s.replaceLstChar = '!'
	println(s)
}

var StringBuilder.replaceLstChar: Char
	get() = get(length - 1)
	set(value: Char) {
		this.setCharAt(length - 1, value)
	}