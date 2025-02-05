# GCD & LCM Calculations in Java  

## 📌 Overview  
This repository contains Java programs to calculate the **Greatest Common Divisor (GCD)** and **Least Common Multiple (LCM)** of numbers. These programs use efficient iterative methods to compute results and are useful for anyone learning Java and number theory concepts.  

---

## 📂 Programs Included  
1. **GCD_or_HCF.java** – Calculates the GCD (also known as HCF) of two numbers using iteration.  
2. **GCD_or_HCF_of_3Numbers.java** – Finds the GCD of three numbers using a similar approach.  
3. **LCM_of_TwoNumbers.java** – Computes the LCM of two numbers using the formula:  
   \[
   LCM(a, b) = \frac{a \times b}{GCD(a, b)}
   \]  

---

## 📘 Explanation of Each Program  

### 🟢 1. Finding GCD of Two Numbers (`GCD_or_HCF.java`)  
The **Greatest Common Divisor (GCD)** of two numbers is the largest number that divides both numbers without leaving a remainder.  

### **🔹 Algorithm Used:**  
1. Take two integer inputs from the user.  
2. Start a loop from `1` to the smaller of the two numbers.  
3. If a number divides both `num1` and `num2` perfectly, update the `gcd` value.  
4. Print the final `gcd` value.  

### **📌 Code Implementation:**  
```java
import java.util.Scanner;

public class GCD_or_HFC {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int num1 = s.nextInt();
        System.out.println("Enter the 2nd Number:");
        int num2 = s.nextInt();
        int gcf = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcf = i;
        }
        System.out.println("GCD of " + num1 + " & " + num2 + " is: " + gcf);
    }
}
```
### 🔹 Example Input & Output
```
Enter the 1st Number: 36  
Enter the 2nd Number: 48  
GCD of 36 & 48 is: 12  
```

### 🔵 2. Finding GCD of Three Numbers (GCD_or_HCF_of_3Numbers.java)
- The method to find the GCD of three numbers follows the same process as for two numbers but includes an additional check for divisibility by the third number.

### 🔹 Algorithm Used:
- Take three integer inputs from the user.
- Start a loop from 1 to the smallest of the three numbers.
- If a number divides num1, num2, and num3 perfectly, update gcd.
- Print the final gcd value.
  
### 📌 Code Implementation:
```java
import java.util.Scanner;

public class GCD_or_HFC_of_3Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int num1 = s.nextInt();
        System.out.println("Enter the 2nd Number:");
        int num2 = s.nextInt();
        System.out.println("Enter the 3rd Number:");
        int num3 = s.nextInt();
        int gcf = 1;

        for (int i = 1; i <= num1 && i <= num2 && i <= num3; i++) {
            if (num1 % i == 0 && num2 % i == 0 && num3 % i == 0)
                gcf = i;
        }
        System.out.println("GCD of " + num1 + ", " + num2 + " & " + num3 + " is: " + gcf);
    }
}
```
### 🔹 Example Input & Output
```
Enter the 1st Number: 24  
Enter the 2nd Number: 36  
Enter the 3rd Number: 48  
GCD of 24, 36 & 48 is: 12  
```
### 🟠 3. Finding LCM of Two Numbers (LCM_of_TwoNumbers.java)
- The Least Common Multiple (LCM) of two numbers is the smallest number that is a multiple of both.

### 🔹 Formula Used:
```
             𝑎×𝑏
𝐿𝐶𝑀(𝑎,𝑏)= --------        
           𝐺𝐶𝐷(𝑎,𝑏)
 ```
### 🔹 Algorithm Used:
- Take two numbers as input.
- Compute the GCD using an iterative loop.
- Use the LCM formula to compute the LCM.
- Print the final result.

### 📌 Code Implementation:
```java
import java.util.Scanner;

public class LCM_of_TwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the 1st Number:");
        int num1 = s.nextInt();
        System.out.println("Enter the 2nd Number:");
        int num2 = s.nextInt();
        int gcf = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcf = i;
            }
        }
        int lcm = (num1 * num2) / gcf;
        System.out.println("LCM of " + num1 + " & " + num2 + " is: " + lcm);
    }
}
```

### 🔹 Example Input & Output
```
Enter the 1st Number: 12  
Enter the 2nd Number: 18  
LCM of 12 & 18 is: 36  
```
### 🎯 Key Takeaways
- GCD is found by checking the highest number that divides both inputs.
- LCM is calculated using the GCD formula to ensure efficiency.
- The approach used is an iterative method, which is easy to understand and implement.

## 📌 How to Run the Programs
- Clone this repository
  ```
  https://github.com/Ananthadatta02/Java-GCD_LCM.git
  ```
