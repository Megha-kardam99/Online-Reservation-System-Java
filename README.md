# Online Reservation System — Java Console Application

**Developer:** Megha Kardam  
**GitHub:** [Megha-kardam99](https://github.com/Megha-kardam99)  
**Language:** Java 17  
**Type:** Personal Project  

---

## About

A console-based train reservation system built in Core Java.  
Simulates core IRCTC features — login, booking, PNR generation, cancellation, admin panel.

---

## Features

- User Registration and Secure Login
- View 8 pre-loaded train routes across India
- Book tickets with auto PNR number generation
- Fare calculation by class type and distance
- 6 class options — 1A, 2A, 3A, SL, CC, 2S
- Ticket cancellation with 85% refund
- Admin panel — view all bookings and all users

---

## Project Structure

The project has 4 Java files inside src/reservation/

- User.java — User model for both passengers and admin
- Ticket.java — Ticket model with auto-generated PNR number
- ReservationDatabase.java — In-memory database with users, trains, and tickets
- ReservationSystem.java — Main class with all menus and operations (entry point)

---

## How to Run in IntelliJ

1. Open IntelliJ IDEA
2. File → Open → select this project folder
3. Right-click the src folder → Mark Directory As → Sources Root
4. Open ReservationSystem.java → click the green Run button next to main method

---

## Demo Credentials

| Login ID | Password  | Role  |
|----------|-----------|-------|
| admin    | admin123  | Admin |
| MK2024   | megha123  | User  |
| RK2024   | rahul123  | User  |
| PS2024   | priya123  | User  |

---

## Available Trains

| Train No | Name | From | To | Distance |
|---|---|---|---|---|
| 12301 | Rajdhani Express | New Delhi | Kolkata | 1450 km |
| 12951 | Mumbai Rajdhani | New Delhi | Mumbai | 1385 km |
| 12302 | Shatabdi Express | New Delhi | Bhopal | 700 km |
| 22691 | Rajdhani Express | Bangalore | New Delhi | 2366 km |
| 12627 | Karnataka Express | Bangalore | New Delhi | 2444 km |
| 12001 | Bhopal Shatabdi | New Delhi | Bhopal | 704 km |
| 15001 | Jan Sadharan Express | Patna | New Delhi | 997 km |
| 12589 | Gorakhpur Express | Gorakhpur | Mumbai | 2003 km |

---

## OOP Concepts Used

| Concept | Where used |
|---|---|
| Classes and Objects | User, Ticket, ReservationDatabase, ReservationSystem |
| Encapsulation | All fields are private with getters |
| Static variable | PNR counter auto-increments across all tickets |
| Collections | HashMap for users and tickets, ArrayList for trains |
| LinkedHashMap | Preserves insertion order for class fare display |

---

## Tech Stack

- Java 17
- IntelliJ IDEA Community Edition
- Core Java — no external libraries needed
