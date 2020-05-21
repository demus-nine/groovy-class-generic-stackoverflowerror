package generics.implOne

import generics.Combination
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class CombinationImplOne extends Combination<CombinationImplOne, ContainerImplOne> {

    ContainerImplOne container
    CombinationImplOne selfTypeOne
    CombinationImplOne selfTypeRefTwo

}
