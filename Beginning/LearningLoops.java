package Beginning;

public class LearningLoops {
    public static void main(String[] args){
        System.out.println("Ascending Order\n");
        for(int i = 1; i <= 10; i ++){
            System.out.printf("Current Number: %d\n", i);
        }
        System.out.println("Descending Order\n");
        for(int i = 10; i >= 1; i --){
            System.out.printf("Current Number: %d\n", i);
        }
    }
}
