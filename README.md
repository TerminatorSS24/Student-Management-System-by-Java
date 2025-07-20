# 🧑‍🎓 Student Management System

A simple and modular **Command Line Interface (CLI)** based **Student Management System** built using **Java**, implementing **Object-Oriented Programming (OOP)** principles and **File I/O** for persistent data storage.

---

## 📌 Project Overview

This project allows users to manage student records — including **adding**, **viewing**, **editing**, and **deleting** data — through an interactive terminal interface. It stores all student information in a local text file (`students.txt`), simulating a lightweight database system.

---

## ✨ Features

- ➕ Add new student records
- 📋 View all existing student entries
- ✏️ Edit student details using Student ID
- ❌ Delete student records using Student ID
- 💾 Persistent data storage using plain text file (`students.txt`)
- 🧱 Structured using OOP principles for clean and maintainable code

---

## 🛠️ Technologies Used

- **Java**
- **OOP (Object-Oriented Programming)**
- **Java File I/O** (BufferedReader, BufferedWriter)
- **Standard CLI (Command Line Interface)**

---

## 📂 Folder Structure

```
StudentManagementSystem/
├── src/
│ ├── Main.java # Entry point for CLI interaction
│ ├── Student.java # Student class with attributes and methods
│ └── StudentManager.java # File handling and record operations
├── students.txt # Auto-created file to store student data
└── README.md # Project documentation
```
---

## 🚀 How to Run the Project

1. **Clone or Download** this repository.

2. Open a terminal and navigate to the `src/` directory:

```cd src/```

3. Compile the Java files:

```javac *.java```

4. Run the application:

```java Main```
 