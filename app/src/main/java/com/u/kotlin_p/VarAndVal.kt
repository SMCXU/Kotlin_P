package com.u.kotlin_p

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-10-30
 * 更改时间：2019-10-30
 * 版本号：1
 * 文件描述：
 *
 */

fun main(args: Array<String>) {

    var name = "张三"
    println(name)
    name = "李四"
    println(name)
    println(plus(3,4))

    var a = 8
    var b = 3

    println("a+b = "+ plus(a, b))
    println("a-b = "+ sub(a, b))
    println("a*b = "+ mutl(a, b))
    println("a/b = "+ devide(a, b))


}
fun plus(a:Int,b:Int):Int{
    return a+b;
}

fun sub(a:Int,b:Int):Int{
    return a-b;
}

fun mutl(a:Int,b:Int):Int{
    return a*b;
}

fun devide(a:Int,b:Int):Int{
    return a/b;
}


