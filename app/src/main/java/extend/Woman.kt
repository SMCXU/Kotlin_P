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
class Woman(name: String) : HUman(name) {
    override fun pee() {
        println("${name}dz嘘嘘。。。")
    }

    override fun eat() {
        println("${name}呜呜小口吃")
    }
}