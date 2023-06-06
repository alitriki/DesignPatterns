## Singleton Pattern Principles

The Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine. It follows these principles:

1. **Single Instance:** Singleton allows for only a single instance of the class to exist.
2. **Global Access Point:** The singleton class provides a global access point to retrieve the instance of the class.
3. **Usage Scenarios:** Singleton pattern is commonly used for logging, driver objects, caching, thread pools, and other scenarios where a single instance is required.
4. **Integration with Other Patterns:** Singleton design pattern is often used in conjunction with other design patterns such as Abstract Factory, Builder, Prototype, Facade, etc.
5. **Used in Core Java Classes:** Singleton design pattern is also utilized in various core Java classes, such as `java.lang.Runtime` and `java.awt.Desktop`.

## Java Singleton Pattern Implementation

To implement the Singleton pattern in Java, there are different approaches, but they all share the following common concepts:

1. **Private Constructor:** The class has a private constructor to prevent instantiation from other classes.
2. **Private Static Variable:** The class has a private static variable of the same class type, which holds the single instance of the class.
3. **Public Static Method:** The class provides a public static method that returns the instance of the class, acting as a global access point for the outer world to retrieve the singleton instance.


## Context
You are developing a logging system for a large application. The logging system needs to have a single instance that can be accessed throughout the application to ensure consistent logging behavior. Implement the Singleton design pattern to create a Logger class that provides a single instance for logging messages.

**Additional Ressources**
[Singleton tutorial](https://www.digitalocean.com/community/tutorials/java-singleton-design-pattern-best-practices-examples)