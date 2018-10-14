
### Abstract Factory Design Pattern

If you are familiar with factory design pattern in java, you will notice that we have single
Factory class. This factory class returns different subclasses based on the input provided and
factory class uses if-else or switch statement to achieve this.

In the Abstract Factory pattern, we get rid of if-else block and have a factory class for 
each sub-class. Then an Abstract Factory class that will return the sub-class based on the
input factory class. At first, it seems confusing but once you see the implementation, 
it's really easy to grasp(kavramak) and understand the minor(küçük) difference between Factory and Abstract Factory pattern.

