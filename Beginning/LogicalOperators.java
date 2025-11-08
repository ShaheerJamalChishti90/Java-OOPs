package Beginning;
import java.util.*;

public class LogicalOperators {
    public static void main(String[] args) {
//        Logical Operators
//        && || ! (and or not)

//        Making an HR Position selector using &&
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter your gender here (eg: M/F): ");
//        String gender = sc.nextLine();
//
//        System.out.print("Enter your age here: ");
//        int age = sc.nextInt();
//
//        if((gender.equals("F") ) && ((int)age >= (int)25) && (int)age <= (int)40) {
//            System.out.println("You are selected!");
//        } else {
//            System.out.println("we are really sorry!");
//        }


//        || - OR Operator
        System.out.print("Position for the office boy\n");


        System.out.print("Enter your gender here (eg: M/F): ");
        String emp_gender = sc.nextLine();

        System.out.print("Enter your age here: ");
        int emp_age = sc.nextInt();

        if(emp_gender.equals("M") || emp_gender.equals("F") && emp_age >= 18){
            System.out.println("Your are selected!");
        } else {
            System.out.println("You are not selected!");
        }
    }
}
