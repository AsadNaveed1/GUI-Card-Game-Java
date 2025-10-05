# GUI-Card-Game-Java


![Java Badge](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

## Table of Contents

- [Screenshot](#screenshot)
- [Description](#description)
- [Game Rules](#game-rules)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [How to Play](#how-to-play)

---

## Screenshot

![Game](docs/images/Img1.png)

---

## Description

The computer will simulate the dealer. When the game starts, 52 playing cards will be shuffled and the player is given $100. At each round of the game, both the player and the dealer will be given 3 cards (they are drawn from the top of the deck). Player will place his/her bet (you can assume the player always place a positive integer bet). Then before the dealer opens the cards, the player has a chance to draw AT MOST two cards from the top of the deck to replace any two of the cards on hand and each card on hand can only be replaced ONCE. Player will lose the bet if the dealer got a better hand (see below for explanation), otherwise the player wins the same amount of money as his/her bet.

---

## Game Rules

Rules to determine who has better cards:
J, Q, K are regarded as special cards.

* **Rule 1:** The one with more special cards wins.
* **Rule 2:** If both have the same number of special cards, add the face values of the other card(s) and take the remainder after dividing the sum by 10. The one with a bigger remainder wins. (Note: Ace = 1).
* **Rule 3:** The dealer wins if both rule 1 and rule 2 cannot distinguish the winner.

---

## Prerequisites

- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

---

## How to Run

### Using Command Line

1. **Ensure you have the Images folder:** Make sure the `Images` folder containing all card images is in the same directory as your Java files.

2. **Open terminal/command prompt** and navigate to the project directory:
   ```bash
   cd path/to/GUI-Card-Game-Java
   ```

3. **Compile all Java files:**
   ```bash
   javac Main.java SetGame.java StartGame.java
   ```

4. **Run the Main class:**
   ```bash
   java Main
   ```

---

## How to Play

1. **Start the Game:** Enter your bet amount in the text field and click the "Start" button
2. **View Your Cards:** Three cards will be dealt to you (face up)
3. **Replace Cards (Optional):** You can replace up to 2 cards by clicking the "Replace Card" buttons
4. **See Results:** Click the "Result" button to reveal the dealer's cards and determine the winner
5. **Continue Playing:** If you have money remaining, place another bet and click "Start" for the next round
6. **Game Over:** The game ends when you run out of money

