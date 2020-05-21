package generics.implOne

import generics.GenericConsumer

class GenericConsumerImplOne extends GenericConsumer<GenericConsumerImplOne> {

    GenericConsumerImplOne current
    GenericConsumerImplOne other

    static GenericConsumerImplOne testMethod() {
        return new GenericConsumerImplOne()
    }

}
