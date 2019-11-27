package com.u.kotlin_p

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-11-12
 * 更改时间：2019-11-12
 * 版本号：1
 * 文件描述：
 *
 */
fun main(args:Array<String>){
    val lists = listOf("买鸡蛋","买水")

    for ((i,e) in lists.withIndex()){
        println("$i  $e")
    }
}