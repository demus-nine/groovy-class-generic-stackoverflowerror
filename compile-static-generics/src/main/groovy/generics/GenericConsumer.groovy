package generics

import generics.implOne.GenericConsumerImplOne
import generics.implTwo.GenericConsumerImplTwo

// Stackoverflow even when specifyinh the constaints on the generic generics
// abstract class GenericConsumer<CB extends GenericTarget<CB>> {
abstract class GenericConsumer<CB extends GenericConsumer> {

    abstract CB getCurrent()
    abstract CB getOther()

    String anId

    static Class<? extends GenericConsumer> findSpecificType(String aCategory) {
        switch (aCategory) {
            case 'cat1':
                return GenericConsumerImplTwo
            case 'cat2':
                return GenericConsumerImplOne
            default:
                throw new IllegalArgumentException()
        }
    }

    static GenericConsumer testMethod() {
        return null
    }

}
