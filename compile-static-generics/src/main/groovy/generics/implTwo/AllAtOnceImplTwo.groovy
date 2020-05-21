package generics.implTwo

import generics.AllAtOnce
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class AllAtOnceImplTwo extends AllAtOnce<AllAtOnceImplTwo, SimplestImplTwo, ExtendedSimplestImplTwo, ContainerImplTwo, CombinationImplTwo> {

    ExtendedSimplestImplTwo extendedSimplest
    ContainerImplTwo latestContainer
    CombinationImplTwo currentCombination
    Set<ContainerImplTwo> containers

    SimplestImplTwo simplestReadonly

    static AllAtOnceImplTwo testMethod(ExtendedSimplestImplTwo extendedSimplest, String anId) {
        return new AllAtOnceImplTwo()
    }

}
