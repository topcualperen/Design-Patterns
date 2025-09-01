# Java Design Patterns Examples

This repository contains implementations of various design patterns in Java. Each pattern is implemented with clear examples to demonstrate its usage and benefits.

## 📋 Currently Implemented Patterns

### 1. Singleton Pattern
- Location: [`singleton/DatabaseConnection.java`](singleton/DatabaseConnection.java)
- Purpose: Ensures a class has only one instance and provides a global point of access to it
- Example: Database connection management

### 2. Factory Pattern
- Location: [`factory/Main.java`](factory/Main.java)
- Purpose: Defines an interface for creating objects but lets subclasses decide which class to instantiate
- Example: Animal creation system (Dog, Cat)

### 3. Observer Pattern
- Location: [`observer/Main.java`](observer/Main.java)
- Purpose: Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified
- Example: News agency notification system

### 4. Facade Pattern
- Location: [`facade/Main.java`](facade/Main.java)
- Purpose: Provides a unified interface to a set of interfaces in a subsystem
- Example: Smart home system controlling multiple subsystems

### 5. Strategy Pattern
- Location: [`strategy/Main.java`](strategy/Main.java)
- Purpose: Defines a family of algorithms, encapsulates each one, and makes them interchangeable
- Example: Payment processing system with different payment methods

### 6. Builder Pattern
- Location: [`builder/Main.java`](builder/Main.java)
- Purpose: Separates the construction of a complex object from its representation
- Example: Computer system configuration builder

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) installed
- Any Java IDE (optional)

### Running the Examples
1. Clone the repository:
```bash
git clone https://github.com/topcualperen/Design-Patterns.git
```
2. Navigate to the specific pattern directory
3. Compile and run the Java file

## 📁 Project Structure
```
design-patterns/
├── singleton/
│   └── DatabaseConnection.java
├── factory/
│   └── Main.java
├── observer/
│   └── Main.java
├── facade/
│   └── Main.java
├── strategy/
│   └── Main.java
├── builder/
│   └── Main.java
└── README.md
```

## 🔄 Pattern Categories

The patterns in this repository are (or will be) organized into three main categories:

1. **Creational Patterns**
   - Singleton ✅
   - Factory ✅
   - Builder ✅

2. **Structural Patterns**
   - Facade ✅

3. **Behavioral Patterns**
   - Observer ✅
   - Strategy ✅

✅ = Implemented

## 📝 Contributing

Feel free to contribute to this project by:
1. Adding new design pattern implementations
2. Improving existing implementations
3. Adding more real-world examples
4. Improving documentation

## 📚 Resources

- Claude Ai

---
Created and maintained by [topcualperen](https://github.com/topcualperen)