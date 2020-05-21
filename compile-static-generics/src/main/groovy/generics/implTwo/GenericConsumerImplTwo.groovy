package generics.implTwo

import generics.GenericConsumer

class GenericConsumerImplTwo extends GenericConsumer<GenericConsumerImplTwo> {

    GenericConsumerImplTwo current
    GenericConsumerImplTwo other

    static GenericConsumerImplTwo testMethod() {
        return new GenericConsumerImplTwo()
    }

}
