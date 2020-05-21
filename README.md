# groovy-circular-generics

An example project to illustrate a StackoverflowError when using
a class with a generic parameter as the output of a closure without
parameters. Apparently the groovy compiler tries to resolve the
generic parameters of the class, but doesn't have enough context to
arrive at a conclusion.
 
