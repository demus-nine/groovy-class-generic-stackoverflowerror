package generics.implOne

import generics.ExtendedSimplest
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class ExtendedSimplestImplOne extends ExtendedSimplest<SimplestImplOne> {

    SimplestImplOne simplest

}
