# Simple Tic-Tac-Toe Game with Java Swing, Login, and Statistics
## Student Information
Name: Febrina Erwinda Putri

Student ID: 5026251040

Class: E

## Project Description
This project is a simple Tic-Tac-Toe game built using Java Swing.
The application includes login, game statistics, and Top 5 scorer
feature.

## Features
User authentication using database credentials

Interactive Tic-Tac-Toe game built with Java Swing

Automatic win, lose, and draw detection

Player statistics tracking

Score calculation based on game results

Personal statistics display

Top 5 leaderboard based on player scores

Database integration using JDBC

## Database
Database used: MySQL 
Database Name:

```text
game_dasprog
```

Table:

```text
players
```

### Table Structure

| Column | Data Type | Description |
|---------|------------|------------|
| id | INT | Primary Key |
| username | VARCHAR(50) | Player username |
| password | VARCHAR(100) | Player password |
| wins | INT | Number of wins |
| losses | INT | Number of losses |
| draws | INT | Number of draws |
| score | INT | Total player score |

## How to Run
1. Create a MySQL database.
2. Execute the SQL script located in database/schema.sql.
3. Add the MySQL JDBC Driver to the project libraries.
4. Configure the database connection settings inside DatabaseManager.java.
5. Open the project in IntelliJ IDEA or another Java IDE.
6. Run Main.java.
7. Log in using one of the available accounts in the database.
## Class Explanation
Main:
Acts as the entry point of the application and launches the Login Window.

DatabaseManager:
Handles database connection settings and provides JDBC connections for other classes.

Player:
Represents player information, including personal data and game statistics.

PlayerService:
Manages database operations such as login validation, statistics updates, and leaderboard retrieval.

GameLogic:
Contains the main game rules, including move validation, winner checking, draw detection, and computer moves.

LoginFrame:
Provides the user interface for entering username and password.

MainMenuFrame:
Displays the main menu and allows users to access different features of the application.

GameFrame:
Handles the Tic-Tac-Toe gameplay interface and connects user actions with the game logic.

StatisticsFrame:
Displays the current player's game statistics.

TopScorersFrame:
Shows the Top 5 players ranked by score using a JTable component.

## Screenshots

### Login & Navigation

<table>
<tr>
<th>Login</th>
<th>Main Menu</th>
</tr>

<tr>
<td>
<img src="Screenshot 2026-06-26 153057.png">
</td>

<td>
<img src="screenshots/main-menu-window.png" width="400">
</td>
</tr>

</table>

### Gameplay

<table>
<tr>
<th>Game Window</th>
<th>Player Wins</th>
<th>Draw Result</th>
</tr>

<tr>
<td>
<img src="screenshots/game-window.png" width="300">
</td>

<td>
<img src="screenshots/win-result.png" width="300">
</td>

<td>
<img src="screenshots/draw-result.png" width="300">
</td>
</tr>

</table>

### Statistics & Leaderboard

<table>
<tr>
<th>My Statistics</th>
<th>Top 5 Scorers</th>
</tr>

<tr>
<td>
<img src="screenshots/statistics-window.png" width="400">
</td>

<td>
<img src="screenshots/top-scorers-window.png" width="400">
</td>
</tr>

</table>
## Video Link
YouTube:
[https://youtu.be/Bv56fwcNArg?si=h7DhnJTu42UXzw_W]
