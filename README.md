# Exercise 4 - Softwarequalität

This documentation is based on the structure provided by the lecture.
![grafik](https://github.com/user-attachments/assets/3dcbee2e-bf7e-4290-a326-ae60f0db8cce)

## Stack and GCD Utility
### Purpose

This repository provides Java implementations of basic mathematical and data structure utilities:
* Greatest Common Divisor (GCD) calculation using the Euclidean algorithm in MyMaths class.
* A basic stack implementation with functionalities such as push, pop, top, and size in the Stack class.

### Installation

To use these utilities, clone the repository and ensure you have Java installed on your machine (Java 8 or higher).

### Usage
#### GCD Calculation

To calculate the GCD of two numbers:

* Create an instance of MyMaths.
* Call the gcd(int m, int n) method with two integers as arguments.

Example:

##### GCD Operations

MyMaths maths = new MyMaths();
int result = maths.gcd(48, 18); // Returns 6

##### Stack Operations

To use the stack:
* Create an instance of Stack with a specified size.
* Use the push, pop, top, isEmpty, and size methods to interact with the stack.

Example:
Stack stack = new Stack(3);
stack.push(5);
stack.push(10);
int topElement = stack.top(); // Returns 10
int size = stack.size(); // Returns 2

### Contributing

* Contributions are welcome. Please fork the repository, make changes, and submit a pull request.
Citation Hint
* If you use this code for academic or research purposes, please cite this repository.
License
