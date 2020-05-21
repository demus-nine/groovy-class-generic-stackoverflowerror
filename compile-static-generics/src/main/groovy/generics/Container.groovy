package generics

abstract class Container<CA extends AllAtOnce> {

    boolean ignoreSomething

    abstract String getAname()

    abstract CA getAllAtOnce()

}
