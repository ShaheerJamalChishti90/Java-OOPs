package Beginning;

public class Main {
    public static void main(String[] args){
        // System.out.print("Hello This is the First Line of code"); //This is the basic Print line

        // Learning Data Types 
        // Primitives
        String user = "Shaheer Jamal";
        int age = 19;
        // int ph = 0300123456;
        long phone = 0300123456L;
        float height = 5.9F;
        double weight = 55.4;
        // char name_initial = 'S';
        boolean is_student = true;
        
        // This is the basic Formated string in java (similar to the F String of Python)
        System.out.printf("%s is %d year old. He weights %.2f and is %.2f tall\n", user, age, weight, height);
        System.out.printf("%s's phone number is %d\n", user, phone);
        System.out.printf("%s is a student and the data says it is %b\n", user, is_student);
        
        // Non-Primitive Data Type
        String username = "Shaheer Jamal";
        System.out.printf("This is the length of the username: %s\n", username.length());

        String friend = new String("Saad");
        System.out.printf("%s is the friend of %s\n", friend, username);
        
        String new_friend = friend.replace("Saad", "Saad Iftikhar");
        System.out.printf("%s is the friend of %s\n", new_friend, username);
        
        // Sub String - similar to the string slicing in Python
        System.out.println(username.substring(0, 8));

    }
}

// Data Types - Primitives and Non-Primitives
// In dono ke beech mein kuch differences hain,
// jaisay non-primitive data types ke apny hii kuch functions hain 
// jin ko mein un ke upper istemal kar sakta hoon, 
// matlab: String ki length nikalna, 
// ab string khud ek non primitive data type hai tou mein uske upar length wala function apply karna ---

// Non-Primitive Data Types
// String, Arrays 

// new: iss keyword ki help se hum classes ke objects banatay hain

// Strings: Java ke ander strings immutable hoti hain


