package generics

abstract class ExtendedSimplest<S extends Simplest> implements Serializable {

    String aString

    abstract S getSimplest()

}
