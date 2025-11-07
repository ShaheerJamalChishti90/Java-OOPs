package Beginning;
import java.util.*;


public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name here: ");
        String username = sc.nextLine();

        System.out.printf("This is the username: %s", username);
    }
}
