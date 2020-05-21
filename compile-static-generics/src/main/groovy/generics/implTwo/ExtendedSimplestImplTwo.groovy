package generics.implTwo

import generics.ExtendedSimplest
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class ExtendedSimplestImplTwo extends ExtendedSimplest<SimplestImplTwo> {

    SimplestImplTwo simplest

}
