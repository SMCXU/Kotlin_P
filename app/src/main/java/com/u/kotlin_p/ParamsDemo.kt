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
val Pi = 3.1415926f;

fun main(args: Array<String>) {

    println(getTrapezoid(r = 10f, h = 10f))
}

fun getRectArea(a: Int, b: Int): Int {
    return a * b
}

fun getCircleArea1(p: Float = Pi, r: Float): Float {
    return 2 * p * r
}

fun getCircleArea2(p: Float = Pi, r: Float): Float {
    return p * r
}

fun getTrapezoid(p: Float = Pi, r: Float, h: Float): Float {
    return p * r * r * h
}

fun getBallSArea(p: Float = Pi, r: Float): Float {
    return p * r * r * 4
}