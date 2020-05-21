package generics.implOne

import generics.AllAtOnce
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class AllAtOnceImplOne extends AllAtOnce<AllAtOnceImplOne, SimplestImplOne, ExtendedSimplestImplOne, ContainerImplOne, CombinationImplOne> {

    ExtendedSimplestImplOne extendedSimplest
    ContainerImplOne latestContainer
    CombinationImplOne currentCombination
    Set<ContainerImplOne> containers

    SimplestImplOne simplestReadonly

    static AllAtOnceImplOne testMethod(ExtendedSimplestImplOne extendedSimplest, String anId) {
        return new AllAtOnceImplOne()
    }

}
