package generics

import generics.implOne.AllAtOnceImplOne
import generics.implTwo.AllAtOnceImplTwo

abstract class AllAtOnce<AAO extends AllAtOnce, SI extends Simplest, ESI extends ExtendedSimplest<SI>, CT extends Container<AAO>, CB extends Combination<CB, CT>> {

    abstract CT getLatestContainer()

    abstract CB getCurrentCombination()

    abstract Set<CT> getContainers()

    abstract ESI getExtendedSimplest()
    abstract void setExtendedSimplest(ESI value)

    abstract SI getSimplestReadonly()
    abstract void setSimplestReadonly(SI value)

    SI getSimplest() {
        return extendedSimplest?.simplest
    }

    String getAString() {
        return extendedSimplest?.aString
    }

    String anId

    static Class<? extends AllAtOnce> findSpecificType(String aCategory) {
        switch (aCategory) {
            case 'cat1':
                return AllAtOnceImplTwo
            case 'cat2':
                return AllAtOnceImplOne
            default:
                throw new IllegalArgumentException()
        }
    }

}
