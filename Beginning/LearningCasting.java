package Beginning;

public class LearningCasting {
    public static void main(String[] args){

//        Implicit Casting
        double big_pi = 3.142851987987654;
        double final_pi = big_pi + 2;

        System.out.printf("Original Pi Price: %.2f\nFinal Price + GST: %.2f\n", big_pi, final_pi);

//        Explicit Casting
        int tax = 5;
        int FinalPrice = tax + (int)big_pi; // Yahan mein isko bata raha hoon ke double datatype ko int mein convert kardo
        System.out.printf("Tax: %d\nFinal Price: %d\n", tax, FinalPrice);


//        Learning Constants
//        I dont wanna change the value of PI, so there is what i will do
        final double PI = 3.1428;
        System.out.println(PI);
    }
}

// Implicit Casting: Java khud chotay data types ko baray data type mein convert kardeta hai
// Eg: int type se double mein convert karna implicit casting kehlayega
// Aasan alfaaz mein: ek double walay variable ke ander mein int ki value sath sath store kar sakta hoon

// Explicit Casting: Iss mein hum khud casting karwa rahay hoty hain, basically hum batatay hain ke java ko ke humara data uss hii type mein store karo jo hum ne define kari hai, humein farq nahi parta agar thora data lose ho bhi jaye tou
// Eg: int type walay variable ke ander double ki value store karna

// Constants: basically constant ki value change nahi hogi
// tou agar aapko koii variable banana hai jiski value aapko change nahi karni usko constant varibale banado