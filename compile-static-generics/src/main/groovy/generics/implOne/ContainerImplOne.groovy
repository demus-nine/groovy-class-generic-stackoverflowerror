package generics.implOne

import generics.Container
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class ContainerImplOne extends Container<AllAtOnceImplOne> {

    AllAtOnceImplOne allAtOnce

    @Override
    String getAname() {
        return 'cat1'
    }

}
