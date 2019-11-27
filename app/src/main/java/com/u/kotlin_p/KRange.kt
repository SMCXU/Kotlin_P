package com.u.kotlin_p

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-11-12
 * 更改时间：2019-11-12
 * 版本号：1
 * 文件描述：
 *
 */
fun main(args: Array<String>) {

    range()
}

fun range() {
    //step  步幅是2
    //reversed 反转
    var nums1 = 1..1000 //闭区间 []
    var nums2 = 1 until 1000 //前闭后开[)
    var result = 0
    for (num in nums1 step 2) {
        result += num
    }

    println("结果：${result}")
}