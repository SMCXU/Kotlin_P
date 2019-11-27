package yinzhang

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-11-26
 * 更改时间：2019-11-26
 * 版本号：1
 * 文件描述：
 *
 */
fun main(args: Array<String>) {
    var a: Son = Son.LuoZi()
    var b: Son = Son.XiaoXiaoLv()
    var c: Son = Son.XiaoXiaoLv()

//    a.sayHello()
//    b.sayHello()

    val list = listOf<Son>(a, b, c)
    for (k in list) {
        if (k is Son.XiaoXiaoLv) {
            k.sayHello()
        }
    }
}