package demo

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

//    filterGirlByAddress("广东")
//
//    filterGirlByAge(30)

//    filterGrlByAddressAgeHeight("广东", 170, 20)

    //找年龄最大的

    println("年龄最大的是${data.maxBy { it.age }}")
    println("身高最高的是${data.maxBy { it.height }}")
    println("身高最低的是${data.minBy { it.height }}")

    println("${data.filter {
        it.age > 18 && it.height > 168

    }}")

    //过滤
    println("${data.filter {
        it.age > 18 && it.age < 25

    }}")

    //把某个属性取出放到集合里
    println(data.map {
        "${it.name}:${it.age}"
    })
}