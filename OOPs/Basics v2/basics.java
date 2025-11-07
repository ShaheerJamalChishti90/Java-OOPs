// Basic syntax of Java
// public class basics {
//     public static void main(String[] args) {
//         System.out.println("This is the output");
//     }
// }

// Data Types in Java
// int age = 18;
// double price = 99.99;
// char grade = 'A';
// boolean isJavaFun = true;
// String name = "Shaheer";


// Variables and Operators
// Arithmetic operators: + - * / %
// Comparison operators: == != > < >= <=
// Logical operators: && || !
// Assignment operators: = += -= *= /=

// int a = 10, b = 5;
// System.out.println(a > b && b > 2 && b != a); // true

// Conditional Statements and Loops 
// if (age >= 18) {
//     System.out.println("Adult");
// } else {
//     System.out.println("Minor");
// }

// for (int i = 1; i <= 5; i++) {
//     System.out.println(i);
// }

// while (condition) { ... }
// do { ... } while (condition);
// switch (value) { case 1: ...; break; default: ...; }

// Arrays
// int[] marks = {90, 80, 70};
// System.out.println(marks[0]); // 90


// Fuctions and Methods
// public static void greet() {
//     System.out.println("Hello, Java!");
// }

// public static int add(int a, int b) {
//     return a + b;
// }

// public static void main(String[] args) {
//     greet();
//     System.out.println(add(5, 3));
// }


// Understanding static and void concept

// A static method belongs to the class, not to any object.
// That means you can call it without creating an object.
// class Hello1 {
//     static void greet1() {
//         System.out.println("Hello from static method!");
//     }
// }

// public class basics {
//     public static void main(String[] args) {
//         Hello1.greet1(); // works, no object needed
//     }
// }

// Without static, you would need to create an object first:
class Hello2 {
    void greet2() {
        System.out.println("Hello from non-static method!");
    }
}

public class basics {
    public static void main(String[] args) {
        Hello2 obj = new Hello2();
        obj.greet2(); // works only after creating object
    }
}
