package interfaces

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
    val man = Man()
    man.haha()

    val taiJian = TaiJian()
    taiJian.eat()

    val man2 = listOf<Human>(man, taiJian)
    for (p in man2) {
//        if (p is Man) {
            p.eat()
//        }
    }
}