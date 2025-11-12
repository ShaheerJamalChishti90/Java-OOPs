public class Parameterized {
    public static void main(String[] args) {
        StudentParameterized shaheer = new StudentParameterized("Shaheer Jamal", 17);
        shaheer.StudentInfo();
    }
}

class StudentParameterized{
    String name;
    int rollno;

    public void StudentInfo(){
        System.out.printf("Name: %s\nRoll# %d", this.name, this.rollno);
    }

    StudentParameterized(String name, int rollno){
        System.out.println("We are inside the Parameterized Constructor!!");
       this.name = name;
       this.rollno = rollno;
    }
}

// Parameterized Constructor: ye basically object creation ke time pe arguments leta hai as an input aurr phir accordingly result generate kardeta hai