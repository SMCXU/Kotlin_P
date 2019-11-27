package yinzhang

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-11-26
 * 更改时间：2019-11-26
 * 版本号：1
 * 文件描述：
 * sealed只能有指定个数个类型
 */
sealed class Son {

    class XiaoXiaoLv():Son()
    class LuoZi():Son()

    fun sayHello(){
        println("大家好")
    }

}