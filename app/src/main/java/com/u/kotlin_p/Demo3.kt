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

    //洗衣服
    val washMachine = WashMachine("小天鹅", 12)

    washMachine.openDoor()
    println("小华把内内放进去了")
    washMachine.closeDoor()

    washMachine.selectedMode(1)
    washMachine.start()

}