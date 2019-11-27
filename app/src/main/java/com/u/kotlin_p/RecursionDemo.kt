package com.u.kotlin_p

import java.math.BigInteger

/**
 * 给我一行代码，还你十个BUG
 * @author：Mr.U
 *
 * 创建时间：2019-11-18
 * 更改时间：2019-11-18
 * 版本号：1
 * 文件描述：
 *
 */
fun main(args: Array<String>) {
    var a = BigInteger("10000000")
    var b = BigInteger("1000000000000000000000000000000000000")

    println(fact(a, BigInteger.ONE))
//    println(a * b)
}

tailrec fun fact(num: BigInteger, result: BigInteger): BigInteger {

    println("num:${num}")
    if (num == BigInteger.ONE) {
        println("result:${result}")
        return BigInteger.ONE
    } else {
        return fact(num - BigInteger.ONE, result + num)
    }
}

fun facts(a: BigInteger, b: BigInteger): BigInteger {
    return a * b
}