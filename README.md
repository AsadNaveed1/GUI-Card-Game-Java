# GUI-Card-Game-Java

Download the Source Code:
Run the Main.java file

## Description

The computer will simulate the dealer. When the game starts, 52 playing cards will be shuffled and the player is given $100. At each round of the game, both the player and the dealer will be given 3 cards (they are drawn from the top of the deck). Player will place his/her bet (you can assume the player always place a positive integer bet). Then before the dealer opens the cards, the player has a chance to draw AT MOST two cards from the top of the deck to replace any two of the cards on hand and each card on hand can only be replaced ONCE. Player will lose the bet if the dealer got a better hand (see below for explanation), otherwise the player wins the same amount of money as his/her bet.

## Instructions

Rules to determine who has better cards:
J, Q, K are regarded as special cards.

* Rule 1: The one with more special cards wins.
* Rule 2: If both have the same number of special cards, add the face values of the other card(s) and take the remainder after dividing the sum by 10. The one with a bigger remainder wins. (Note: Ace = 1).
* Rule 3: The dealer wins if both rule 1 and rule 2 cannot distinguish the winner.
