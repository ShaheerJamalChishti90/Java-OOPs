// there are 3 types of constructors
// Non-Parameterized Constructors
// Parameterized Constructors
// Copy Constructors

public class ClassRoom {
    public static void main(String[] args) {
        Student shaheer = new Student();
        shaheer.name = "Shaheer Jamal";
        shaheer.rollno = 17;

        shaheer.details();
    }
}

class Student{
    String name;
    int rollno;

    public void details(){
        System.out.printf("Name: %s\nRoll#: %d", this.name, this.rollno);
    }

//  This is the Non-Parameterized Constructor
    Student(){
        System.out.println("Constructor Called!");
    }
}





// Non-Parameterized Constructor: Java khud ek non parameterized constructor banadeta hai agar hum khud define nahi karty tou