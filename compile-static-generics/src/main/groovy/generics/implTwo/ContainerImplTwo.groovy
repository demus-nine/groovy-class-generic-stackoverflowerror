package generics.implTwo

import generics.Container
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class ContainerImplTwo extends Container<AllAtOnceImplTwo> {

    AllAtOnceImplTwo allAtOnce

    @Override
    String getAname() {
        return 'cat2'
    }

}
