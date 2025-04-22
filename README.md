# 🔁 Reverse Number (Java Console App)

This simple Java program takes an integer input from the user and prints its **reverse**.  
For example, if the user enters `654`, the program will output `456`.

---

## 💡 What This Program Does

- Prompts the user to input a number
- Reverses the digits of the number using a `while` loop
- Displays the reversed number

---

## 📌 Sample Input and Output

Enter your number here: 12345 The reverse of the number is: 54321


---

## 🧠 Logic Breakdown

### ➤ Step-by-Step Logic

1. Get the last digit using `% 10`
2. Add it to the new number using:
   ```java
   newNum = newNum * 10 + lastDigit;
Remove the last digit using / 10

Repeat until the number becomes 0

➤ Code Snippet:

while (num > 0) {
    int removedNum = num % 10;
    newNum = newNum * 10 + removedNum;
    num = num / 10;
}
🛠 Requirements
Java 8 or higher

Java IDE (like Eclipse or IntelliJ) or the Command Line

🚀 How to Run (In Eclipse)
Create a Java project and a class named ReverseNumber inside package day6

Paste the code into your class file

Save and run the program

Enter any integer when prompted, and view its reversed form

📂 Project Structure

src/
└── day6/
    └── ReverseNumber.java
💡 Possible Enhancements
Handle negative numbers

Add input validation for non-integer values

Convert this logic into a reusable method

Allow reversing multiple numbers in one run

👤 Author
This Java program is designed as a beginner-friendly exercise to practice:

Looping constructs

Number manipulation

Working with user input using Scanner

Happy coding! 💻✨
