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
fun main(args:String){

    var a= "13"
    var b = 13

    a = b.toString()
    b = a.toInt()

    var c = "a3"
    b = c.toInt()
}