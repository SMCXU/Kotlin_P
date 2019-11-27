package com.u.kotlin_p

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-10-31
 * 更改时间：2019-10-31
 * 版本号：1
 * 文件描述：
 *
 */
fun main(args: Array<String>) {
    diary("香山公园")

    gradeStudent(10);
    gradeStudent(1);
    gradeStudent(6);

    diaryGenerator("颐和园")
}

fun diary(placeName: String) {
    var str = "今天天气晴朗，万里无云，我们去${placeName}游玩。\n" +
            "首先，映入眼帘的是${placeName}${numToChinese(placeName.length)}个大字"

    println(str)
}

fun gradeStudent(score: Int) {
    when (score) {
        10 -> println("满分，牛X")
        9 -> println("9分，牛X")
        8 -> println("8分，牛X")
        7 -> println("7分，牛X")
        6 -> println("6分，牛X")
        else -> println("垃圾")
    }
}

fun diaryGenerator(placeName: String) {
    var diary = "今天天气晴朗，万里无云，我们去${placeName}游玩，" +
            "首先，映入眼帘的是${placeName}${numToChinese(placeName.length)}个镏金大字。"

    println(diary)
}

fun numToChinese(num: Int): String {
    var result = when (num) {
        1 -> "一"
        2 -> "二"
        3 -> "三"
        4 -> "四"
        5 -> "五"
        else -> "地名太长，我记不清了"

    }

    return result
}

