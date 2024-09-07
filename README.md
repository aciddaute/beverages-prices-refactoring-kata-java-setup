# Beverages Prices Refactoring Kata Java Setup

[Kata published by Manuel Rivero](https://garajeando.blogspot.com/2019/04/the-beverages-prices-refactoring-kata.html)

## Introduction

We have a simple program that calculates the price of the beverages sold in a coffee house

- Customers can add supplements to their drinks, which increases the total price
- Not all combinations between drinks and supplements are allowed

### Assignment

Our task is to add support for a new cinnamon supplement, which costs __0.05 €__ and can be added to any drink

### Considerations

Before adding any new features, we need to simplify our work by __refactoring__ the current inheritance-based solution, as it lacks extensibility. 
Keep in mind that we must not compromise the solution's validity, some combinations of drinks and supplements are still not allowed!
For this purpose, we have a series of tests we can rely on during the refactor. Once it's complete, we'll be able to easily add the new supplement


## Setup

1. Clone this repo and open it with IntelliJ
2. Configure SDK
   1. File > Project Structure.
   2. Set "SDK" 17
   3. Set Language Level "SDK Default"
3. Configure Gradle
   1. Settings > Build, Execution, Deployment > Build Tools > Gradle
   2. Set Gradle JVM to 17

## Running tests

An "All tests" run configuration is available for running the tests (IntelliJ IDE)