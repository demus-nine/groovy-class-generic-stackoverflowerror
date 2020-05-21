package generics.implOne

import generics.Simplest
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class SimplestImplOne extends Simplest {}
