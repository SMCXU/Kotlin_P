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
data class Girl(var name: String, var age: Int, var height: Int, var address: String)

var data = listOf<Girl>(
    Girl("yier", 18, 168, "山东"),
    Girl("刘亦菲", 19, 178, "山西"),
    Girl("白小仙", 20, 168, "河南"),
    Girl("刘小鹿", 23, 168, "河北"),
    Girl("司马义", 34, 168, "河南"),
    Girl("露露", 43, 168, "海南"),
    Girl("辛德拉", 43, 168, "湖南"),
    Girl("可可", 28, 168, "湖北"),
    Girl("coco", 28, 170, "广东"),
    Girl("米米", 22, 168, "山西"),
    Girl("峰峰", 28, 168, "陕西"),
    Girl("丝丝", 18, 178, "广东"),
    Girl("刘易斯", 28, 168, "广西"),
    Girl("张三丰", 18, 168, "福建"),
    Girl("谢晓蔚", 28, 168, "安徽"),
    Girl("小翠儿", 18, 168, "广东"),
    Girl("白万芊", 18, 168, "内蒙古"),
    Girl("晏辅警", 28, 168, "青海"),
    Girl("过甜甜", 18, 168, "西藏")
)

fun filterGirlByAddress(address: String) {
    val list = ArrayList<Girl>()
    for (girl in data) {
        if (girl.address == address) {
            list.add(girl)
        }
    }

    for (girl in list) {
        println("${girl.address}${girl.age}岁的美女${girl.name}")
    }
}

fun filterGirlByAge(age: Int) {

    val list = ArrayList<Girl>()
    for (girl in data) {
        if (girl.age < age) {
            list.add(girl)
        }
    }

    for (girl in list) {

        println("${girl.address}${girl.age}岁的美女${girl.name}")
    }
}

fun filterGrlByAddressAgeHeight(address: String, height: Int, age: Int) {

    val list = ArrayList<Girl>()

    for (girl in data) {
        if (girl.address == address && girl.height > height && girl.age < age) {
            list.add(girl)
        }
    }

    for (girl in list) {
        println("${girl.address}${girl.age}岁${girl.height}的美女${girl.name}")
    }

}