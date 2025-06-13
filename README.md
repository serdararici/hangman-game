# 🎯 Java Hangman Game

A console-based Hangman game written in Java. This project was created to reinforce core Java concepts through hands-on practice.

This version of the classic Hangman game runs entirely in the terminal. It randomly selects a word from an external file (`words.txt`) and challenges the player to guess the word one letter at a time. With each incorrect guess, a part of the hangman figure is drawn. The player has a maximum of 6 incorrect guesses before the game ends. The game includes input handling, state tracking for the word being guessed, and visual feedback through ASCII art. It’s a great way to practice file I/O, loops, conditionals, and dynamic data structures in Java.

<p align="center">
  <img src="https://github.com/serdararici/hangman-game/blob/main/images/hangman_game_start.JPG" alt="Hangman Demo 1" width="300"/>
  <img src="https://github.com/serdararici/hangman-game/blob/main/images/hangman_game_1%C4%B1.JPG" alt="Hangman Demo 2" width="300"/>
  <img src="https://github.com/serdararici/hangman-game/blob/main/images/hangman_game_game_over.JPG" alt="Hangman Demo 2" width="300"/>
</p>

---

## 📌 Purpose of the Project

This project was developed as a way to:

- Revisit and solidify my understanding of core Java programming.
- Practice file reading, loops, conditionals, and array handling.
- Strengthen my foundation by building functional mini-projects.
- Improve my ability to write clean, structured, and reusable code.

Although simple, this project is a stepping stone to more advanced Java development.

---

## 📘 What I Learned

Through this project, I have gained practical experience with:

- File I/O using `BufferedReader` and handling exceptions.
- Collections such as `ArrayList` for managing dynamic data.
- Random value generation using `Random`.
- Designing a turn-based game loop with input validation.
- Building modular Java applications with helper methods.

---

## 🛠️ How the Game Works

1. A random word is selected from a file (`words.txt`).
2. The player tries to guess the word one letter at a time.
3. Each correct guess reveals the letter in the word.
4. Incorrect guesses are counted and displayed as hangman art.
5. The game ends when the word is fully guessed or the player runs out of attempts (6 max).

---

## 💡 Pseudocode

// JAVA HANGMAN GAME

// READ WORD LIST FROM FILE

// SELECT RANDOM WORD

// INITIALIZE GAME STATE

// DISPLAY WELCOME MESSAGE

// LOOP WHILE WRONG GUESSES < 6

// DISPLAY CURRENT HANGMAN ART

// DISPLAY CURRENT WORD STATE

// GET LETTER GUESS FROM USER

// IF LETTER IS IN WORD

// REVEAL LETTER POSITION(S)

// CHECK IF WORD IS FULLY GUESSED -> WIN

// ELSE

// INCREMENT WRONG GUESSES

// DISPLAY FINAL RESULT (WIN/LOSE)

---

## 🚀 How to Run

1. Make sure Java is installed on your machine (Java 8+).
2. Clone the repository.
3. Add a `words.txt` file in the same directory as `Main.java` with one word per line.
4. Compile and run the project:

```bash
javac Main.java
java Main

