package com.u.kotlin_p

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-11-25
 * 更改时间：2019-11-25
 * 版本号：1
 * 文件描述：
 *
 */
fun main(args: Array<String>) {

    var rec01 = Rect(20,10)
    println("矩形的高度是：${rec01.height}")
    println("矩形的宽度是：${rec01.width}")

    val girl = Girl("彪悍", "甜美")
    println("这个妹子的性格${girl.chactor}")
    println("这个妹子的声音${girl.voice}")

    girl.cry()
    girl.smile()

}

class Rect(var height:Int,var width:Int){

}

class Girl(var chactor:String,var voice:String){

    fun smile(){
        println("妹子笑了一下，摸摸哒")
    }

    fun cry(){
        println("呜呜呜")
    }
}
