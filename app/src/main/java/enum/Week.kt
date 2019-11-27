package enum

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
enum class Week {
    星期一,
    星期二,
    星期三,
    星期四,
    星期五,
    星期六,
    星期日
}

fun main(args: Array<String>) {
    println(Week.星期四.ordinal)
}