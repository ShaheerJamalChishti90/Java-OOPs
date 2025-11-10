package Beginning;
import java.util.*;

public class LearningExceptionHandling {
    public static void main(String[] args){
//        int[] marks = {98, 97, 95};
//        try {
//            System.out.println(marks[0]);
//        } catch (Exception exception) {
//            System.out.println("An exception for caught while accessing an index the 'marks' array " + exception);
//        }
//        System.out.println("We tried to print marks & an exception must have occurred with index >=3");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend here: ");
        int dividend = sc.nextInt();

        System.out.print("Enter divisor here: ");
        int divisor = sc.nextInt();

        try {
            double result = (double)dividend / (double)divisor;
            System.out.printf("%d / %d = %.2f\n", dividend, divisor, result);
        } catch (Exception e) {
            System.out.println("There is an error in calculation, enter the correct numbers");
        }
        System.out.println("Thankyou for using our program!");


    }
}
