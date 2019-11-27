package extend

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
    val man = Man("金三胖")
//    man.eat()
    val woman = Woman("刘亦菲")
//    woman.eat()

    val man1 = Man("拿破仑")
    val woman1 = Woman("伊丽莎白")


    val list = listOf<HUman>(man, man1, woman, woman1)
    for (h in list) {
        h.pee()
    }

}