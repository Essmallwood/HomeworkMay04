package com.yearUp.pluralSightLearning;

/*
NOTES:
SOLID principles - help to create clean and maintainable code.

"Clean Code" - Robert C. Martin

Code fragility - change one part of code, and it breaks many other parts
of the code.

Code rigidity - the tendency for software to
be difficult to change, even in simple ways.
Every change causes problems in dependent modules.

Symptoms of High Technical debt:
- code fragility
- code rigidity

Technical Debt - the cost of writing fast code rather than code of quality.
- The cost usually shows up over long periods time.
- write code for the future and not just the present.

HOW TO KEEP TECHNICAL DEBT UNDER-CONTROL?
- write code
= pay debt (you apply SOLID principles, design patterns, you refactor, decouple your components, and write more unit test)
- write more code
- pay debt (you apply SOLID principles, design patterns, you refactor, decouple your components, and write more unit test)
- repeat


SOLID principles - 5 software design principles that help to keep technical debt under control
S - Single Responsibility Principle
O = Open Closed Principle
L - Liskov Substitution Principle
I - Interface Segregation Principle
D - Dependency Inversion Principle

WAYS TO KEEP YOUR CODE CLEAN AND MANAGEABLE OVER TIME:
- SOLID principles
- Constant refactoring
- Design patterns
- Unit testing (TDD)

S - Single Responsibility Principle
Every function, class, or module should
have one and only one reason to change aka responsibility.

- if statements are a sign that the method has multiple reasons to
change.

Coupling
- level of inter-dependency between various software components.

"If Module A knows too much about Module B, changes to the
internals of Module B may break functionality in Module B."

O = Open Closed Principle
classes, functions, and modules should be closed for
modification, but open for extension.

Closed for modification: each new feature should not modify existing
source code

Open for extension: a component should be extendable to make
it behave in new ways

- when creating a new feature, re-frame from changing existing code.
- inheritance or design patterns are effective ways to add features
without modifying components

API - a contract/ agreement between different software
components on how they should work together


L - Liskov Substitution Principle ( relationship between types)
Any object of a type must be substitutable by objects of a derived
typed without altering the correctness of that program.

-------
if S id a subtype of T, then objects of type T in a program may be
replaced with objects of type S without modifying the functionality
of the program.
----

Is the class rectangle fully substitutable by the class
square?


 */
