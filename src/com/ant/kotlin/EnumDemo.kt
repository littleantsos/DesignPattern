package com.ant.kotlin

enum class Color(val r: Int, val g: Int, val b: Int) {
	RED(255, 0, 0), ORANGE(255, 265, 0), // 2 ��ÿ������������ʱָ������ֵ
	YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
	INDIGO(75, 0, 130), VIOLET(238, 130, 238); // 3 �ֺţ�;���������Ǳ����

	fun rgb() = (r * 256 + g) * 256 + b // 4 ��ö�����ж�����һ������

}

fun main(args: Array<String>) {
	println(Color.BLUE.b)
	println(getRainbowColor(Color.BLUE))
}

//when ���Բ�������
fun getRainbowColor(color: Color) =
		when (color) {
			Color.RED -> "R"
			Color.ORANGE -> "o"
			Color.YELLOW -> "y"
			Color.GREEN -> "G"
			Color.INDIGO -> "i"
			Color.VIOLET -> "v"
			Color.BLUE -> "b"
			else -> throw Exception("Dirty color")
		}

fun getRainbowColor2(color: Color) =
		when {
			color == Color.RED -> "R"
			color == Color.ORANGE -> "o"
			color == Color.YELLOW -> "y"
			color == Color.GREEN -> "G"
			color == Color.INDIGO -> "i"
			color == Color.VIOLET -> "v"
			color == Color.BLUE -> "b"
			else -> throw Exception("Dirty color")
		}
