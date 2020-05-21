package generics.implTwo

import generics.Combination
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class CombinationImplTwo extends Combination<CombinationImplTwo, ContainerImplTwo> {

    ContainerImplTwo container
    CombinationImplTwo selfTypeOne
    CombinationImplTwo selfTypeRefTwo

}
