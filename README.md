# Test Driven Development Demo
## What is Test Driven Development ?
Test Driven Development (TDD) is a software development process that relies on the repetition of a very short development cycle: first the developer writes an (initially failing) automated test case that defines a desired improvement or new function, then produces the minimum amount of code to pass that test, and finally refactors the new code to acceptable standards.
## What this project do ?
This project is a Java implementation of a Stack data structure, along with a suite of JUnit tests to ensure its correct functionality.

A Stack is a Last-In-First-Out (LIFO) data structure, meaning the last item added is the first one to be removed.

## Explanation of the files
Stack:   
This is the main class that implements the Stack data structure. It provides methods to push an item onto the stack, pop an item from the top of the stack, check if the stack is empty, and get the size of the stack.

JUNITStack:   
This class contains a set of JUnit tests for the Stack class. It tests the following scenarios:
- Creating a new empty stack
- Pushing an element to the top of the stack
- Verifying the LIFO behavior of the stack
- Attempting to push an element to a full stack

PushToFullStackException:   
This is a custom exception that is thrown when an attempt is made to push an item onto a full stack.