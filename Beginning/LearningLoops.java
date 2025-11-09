package Beginning;
import java.util.*;

public class LearningLoops {
    public static void main(String[] args) {

//        Using for Loop
//        System.out.println("Ascending Order\n");
//        for(int i = 1; i <= 10; i ++){
//            System.out.printf("Current Number: %d\n", i);
//        }
//        System.out.println("Descending Order\n");
//        for(int i = 10; i >= 1; i --){
//            System.out.printf("Current Number: %d\n", i);
//        }

//        Using While Loop
//        int i = 0;
//        while (i <= 100){
//            System.out.printf("While Loop Works: %d\n", i);
//            i ++;
//        }
//
//        int a = 100;
//        while (a >= 1){
//            System.out.printf("While loops works here as well: %d\n", a);
//            a --;
//        }

//        Using Do While Loop
//        int x = 100;
//        do{
//            System.out.printf("Yes! This is the DO WHILE LOOP: %d\n", x);
//            x --;
//        } while(x >= 50);


//        Mini Program using do while loop
//        Taking input from the user until he enters the negative value
//        Scanner sc = new Scanner(System.in);
//        int user_input = 0;
//        do {
//            System.out.print("Enter a value here: ");
//            user_input = sc.nextInt();
//            System.out.printf("Your entry: %d\n", user_input);
//        } while (user_input > 0);
//        System.out.println("The End of the Program!");

//        Learning Break and Continue!
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number here: ");
        int x = sc.nextInt();
        int xy = x + 5;
        int xyz = x + 2;

        while(true){
            if (x == xyz){
                x += 1;
                continue;
            }

            System.out.println(x);
            x += 1;
            if (x >= xy){
                break;
            }
        }
        System.out.println("THIS IS THE END!");
    }
}
