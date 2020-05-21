package generics

abstract class Combination<CMB extends Combination, CNT extends Container> {

    String id

    abstract CNT getContainer()
    abstract CMB getSelfTypeOne()
    abstract CMB getSelfTypeRefTwo()

}
