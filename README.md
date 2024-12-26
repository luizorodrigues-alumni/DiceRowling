# DiceRowling


This is a Java project for an interactive dice-rolling game where players aim to reach a target score. Players roll two dice, view the results, and track their total score. The main object is of this project is to practice OOP with Java.

---

## Table of Contents

- [Problem Statement](#problem-statement)
- [Features](#features)
- [Requirements](#requirements)

---

## Problem Statement

Create an engaging dice rolling game where players can:
- Roll two dice.
- View the result of each roll.
- Keep track of their total score.
- Decide to roll again or stop at any time.

---

## Features

- **Dice rolling**: Generates random numbers between 1 and 6 for each dice roll.
- **Score calculation**: Adds up the scores for each roll.
- **Player interaction**: Allows players to decide whether to roll again or stop.
- **Interactive gameplay**: Displays the result of each roll and tracks the total score.

---

## Requirements

### Dice Class
- **Private field**: `int value`.
- **Constructors**:
  - Default constructor that initializes `value` to 1.
  - Method `roll` that generates a random number between 1 and 6 and assigns it to `value`.

### Game Class
- Manages the dice rolling and scoring with methods to:
  - Roll two dice.
  - Display the result of each roll.
  - Calculate the score based on the rolled values.
  - Allow the player to decide whether to roll again or stop.

### Main Method
- Provides user interaction, allowing players to roll the dice and view their score.

---

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/DiceRollingAdventure.git
   ```
2. **Navigate to the project directory**:
   ```bash
   cd DiceRollingAdventure
   ```
3. **Compile the Java files**:
   ```bash
   javac Game.java
   ```
4. **Run the game**:
   ```bash
   java Game
   ```
