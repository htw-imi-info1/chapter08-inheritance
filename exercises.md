Inheritance Exercises (Chapter 8)
======================

Refactor the Figures Project
------------------------------
Recall the “figures” Project from the very beginning...

1. find code duplications in the different shapes.
2. refactor the figures project such that the common things of all shapes are in a common superclass “Shape”.


Assigment Compatibility (Exercise 8.18 from the Book)
------------------------
You have four classes and a variable of each of these:

    O o;
    X x;
    T t;
    M m;

The following assignments are all legal (they all compile):

    m = t;
    m = x;
    o = t;
The following assignments are all illegal (they cause compiler errors):

    o = m;
    o = x;
    x = o;

What can you say about the class hierarchy of the classes? draw a class diagram.


AbstractList Hierarchy (Exercise 8.19)
-----------------
Draw an inheritance hierarchy of AbstractList and all its (direct and indirect subclasses as they are defined in the Java standard library.)

Exercises Chapter 9
====================

Does the static type matter?
--------------------
Consider the following example:
class Vehicle {}
class Car extends Vehicle { public int getNumberOfDoors(){ return 5;}}

    Vehicle v = new Car();
    Car c = new Car();

Is there a difference between v and c?
Can you find a code example that compiles for c but not for v?


Static and Dynamic Type (Ex. 9.16)
-----------------------

Write a few lines of code that result in a situation where a variable x has the static type T and the dynamic type D.

