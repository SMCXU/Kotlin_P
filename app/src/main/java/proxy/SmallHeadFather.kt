package proxy

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
class SmallHeadFather : IWashBowl by BigHeadSon {

    override fun washing() {
        println("我是小头爸爸,我赚了10块钱")
        //单例
        BigHeadSon.washing()
        println("我看着儿子把碗洗完了")
    }
}