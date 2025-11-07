package Beginning;
import java.lang.Math;

public class Operators {
    public static void main(String[] args){
//    Arithmetic Operators: + - * / % ++ --
        int abc = 5;
        System.out.printf("The sum of 2 + 2 is: %d\n", 2 + 2);
        System.out.printf("The sum of 4 - 2 is: %d\n", 4 - 2);
        System.out.printf("The sum of 2 * 2 is: %d\n", 2 * 2);
        System.out.printf("The sum of 4 / 2 is: %d\n", 4 / 2);
        System.out.printf("The remainder after diving 5 by 2 is %d\n", 5 % 2);
        System.out.println(++ abc);

//    Assignment Operators: = += -= /= *=
        int a = 24;
        System.out.printf("a + 6 = %d\n", a += 6);
        System.out.printf("a - 6 = %d\n", a-=20);
        System.out.printf("a * 6 = %d\n", a *= 6);
        System.out.printf("a / 6 = %d\n", a /= 6);

//      Comparison Operators: == >= <= != > < | Logical Operators && || !
        int ab = 10;
        int ba = 5;
        System.out.println(ab != ba && ba < ab);

//      Using Maths Class
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));
        System.out.println(Math.random()); //This will return the random value from 0 - 0.9999
        System.out.println((int)(Math.random() * 100));



    }
}

// Operators in Java: There are 4 types of Operators in Java
// Arithmetic, Logical, Comparision, Assignment