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
class Son : Father() {

    override fun action() {
        println("儿子的性格很乖，在公共场合很有礼貌")
    }
}