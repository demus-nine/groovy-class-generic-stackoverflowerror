package generics.implTwo

import generics.Simplest
import groovy.transform.ToString

@ToString(includePackage = false, includeNames = true, includeSuperProperties = true)
class SimplestImplTwo extends Simplest {}
