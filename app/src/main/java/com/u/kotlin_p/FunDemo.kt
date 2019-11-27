package com.u.kotlin_p

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-11-18
 * 更改时间：2019-11-18
 * 版本号：1
 * 文件描述：
 *
 */
fun main(args: Array<String>) {

    println(add(8, 9))

    //效果等同于add函数
    var i = { x: Int, y: Int -> x + y }
    println(i(8, 9))

    //效果同上
    var j: (Int, Int) -> Int = { x, y -> x + y }
    println(j(8, 9))

}

//fun add(x: Int, y: Int): Int {
//    return x + y;
//}
fun add(x: Int, y: Int): Int = x + y