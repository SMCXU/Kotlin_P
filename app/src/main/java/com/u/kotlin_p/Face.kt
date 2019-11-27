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

    checkFace(88)
    checkFace(80)
    println(heat("水"))
    println(heat(null))

}

fun checkFace(score: Int) {
    if (score > 80)
        println("贼帅")
    else
        println("巨丑")
}

//接受一个参数，为非空String类型,加上？表示参数可以为空
fun heat(str: String?): String {

    return "热" + str;
}