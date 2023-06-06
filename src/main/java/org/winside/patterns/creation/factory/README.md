## Factory Design Pattern

The factory design pattern is used when we have a superclass with multiple sub-classes and based on input, we need to return one of the sub-class.

This pattern takes out the responsibility of the instantiation of a class from the client program to the factory class. Let’s first learn how to implement a factory design pattern in java and then we will look into factory pattern advantages. We will see some of the factory design pattern usage in JDK.
Note that this pattern is also known as Factory Method Design Pattern.

## Context
You are working on a video game and need to create different types of enemies in the game. Each enemy type has its own set of characteristics and behaviors. Implement the Factory Method design pattern to create an EnemyFactory class that can create different enemy objects based on input parameters, such as enemy type or difficulty level.
You will be provided with the interface and base classes for the enemies, and your task is to implement the factory class.

## Instructions

1. Familiarize yourself with the provided `Enemy` interface and the two base enemy classes, `SimpleEnemy` and `BossEnemy`. The `Enemy` interface defines the common properties and behavior that all enemies should have.

2. Your task is to implement the `EnemyFactory` class, which will serve as the factory for creating enemy instances.

3. Open the `EnemyFactory` class and implement the `createEnemy()` method. This method should take an `EnemyType

` parameter and a `EnemyDifficulty` parameter and return an instance of the corresponding enemy type with the specified difficulty level. The possible enemy types are `SIMPLE` and `BOSS`, and the possible difficulty levels are `EASY`, `MEDIUM`, and `HARD`.

4. For the `createEnemy()` method, use a switch-case statement to handle different enemy types. For each enemy type, create an instance of the corresponding enemy class (`SimpleEnemy` or `BossEnemy`) with the specified difficulty level, and return it.

5. The `SimpleEnemy` and `BossEnemy` classes have been updated to include the `EnemyDifficulty` parameter in their constructors. The difficulty level should affect the health and attack power of the enemies. Implement the logic to calculate the enemy's health and attack power based on the provided difficulty level.

6. Once you have implemented the `EnemyFactory` class, you can test your implementation in the `main()` method or in a separate test class. Create an instance of the `EnemyFactory` and use it to create different enemies with different enemy types and difficulty levels.

7. After creating an enemy instance, you can call the appropriate methods from the `Enemy` interface to retrieve and manipulate the enemy's properties and behavior.

8. Compile and run your program to verify that the factory is successfully creating different types of enemies with varying difficulty levels based on the input.

9. Optionally, you can extend the exercise by adding more variations of enemies or additional properties and behavior to the enemy classes.

Note: You can refer to the provided code for the `Enemy`, `SimpleEnemy`, `BossEnemy`, `EnemyType`, and `Difficulty` classes to understand their structure and implementation details.

Good luck with the exercise!