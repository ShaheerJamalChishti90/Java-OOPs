package Beginning;
import java.util.*;

public class LearningFuctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("We are inside the main function");

        ReturnsNothing();
        System.out.println("This is the sum function-\nThe sum of x + y is: " + sum(5, 7));

        System.out.println(GreetUser(sc));
    }

    public static void ReturnsNothing(){
        System.out.println("This functions returns nothing bc it uses the void this which means 'Return Nothing!'");
    }

    public static int sum(int x, int y){
        return (x + y);
    }

    public static String GreetUser(Scanner sc){
        System.out.print("Enter your name here: ");
        String username = sc.nextLine();

        return ("Morning beautiful people: " + username);

    }
}
