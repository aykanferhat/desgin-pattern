
### Builder Design Pattern

Builder pattern was introduced to solve some of the problems with Factory and Abstract Factory design 
patterns when the Object contains a lot of attributes.

There are three major issues with Factory and Abstract Factory design patterns when the Object
contains a lot of attributes.

- Too Many arguments to pass from client program to the Factory class that can be error prone 
because most of the time, the type or arguments are same and from client side its hard to 
maintain the order of the argument.

- Some of the parameters might be optional in Factory pattern, we are forces to send all the 
parameters and optional parameters need to send as null.

- If the Object is heavy and its creation is complex, then all that complexity will be part of 
Factory classes that is confusing.


We can solve the issues with large number of parameters by providing a constructor with required
parameters and then different setter methods to set the optional parameters. The problem with this
approach is that the Object state will be inconsistent until unless all attributes are set explicitly


Builder pattern solves issue with large number of optional parameters and inconsistent state by 
providing a way to build the object step-by-step and provide a method that will actually return the
final Object.