package com.u.kotlin_p

import java.lang.Exception

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

    while (true) {
        println("欢迎使用波哥加法计算器")
        println("请输入第一个数字：")
        var num1Str = readLine()
        println("请输入第二个数字：")
        var num2Str = readLine()

        try {
            var num1 = num1Str!!.toInt()
            var num2 = num2Str!!.toInt()
            println("${num1}+${num2} = ${num1 + num2}")
        } catch (e: Exception) {
            println("哥们儿，只能输入数字")
        }
    }


}