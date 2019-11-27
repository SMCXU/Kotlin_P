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
class WashMachine(var module: String, var size: Int) {

    var isDoorOpen = true
    var currentMode = 0

    fun openDoor() {
        println("洗衣机的门已经打开了")
        isDoorOpen = true
    }

    fun closeDoor() {
        println("洗衣机的门已经关闭了")
        isDoorOpen = false
    }

    fun start() {
        if (isDoorOpen) {
            println("门还没关，不能运行。。。")
        } else {

            when (currentMode) {
                0 -> println("选择模式错误，不能选择模式")
                1 -> {
                    println("放水了。。")
                    setMoterSpeed(100)
                    println("轻揉开始发动机转速：慢")
                    println("洗完了")
                }
                2 -> {
                    println("放水了。。")
                    setMoterSpeed(1000)
                    println("轻揉开始发动机转速：慢")
                    println("洗完了")
                }

                else -> {
                    println("模式不能识别")
                }
            }
        }

    }

    fun selectedMode(mode: Int) {
        currentMode = mode
        when (mode) {
            0 -> println("初始模式，请您选择模式")
            1 -> println("轻揉")
            2 -> println("狂揉")
            else -> println("不要乱拧，坏了我不管")
        }
    }

    private fun setMoterSpeed(speed: Int) {
        print("当前发动机转速为${speed}圈/秒")
    }
}