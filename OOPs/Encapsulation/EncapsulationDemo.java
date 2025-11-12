public class EncapsulationDemo {
    public static void main(String[] args) {
        newStudent shaheer = new newStudent();
        shaheer.setName("Shaheer Jamal Chishti");
        shaheer.setAge(19);

        shaheer.studentDetails();

    }
}


class newStudent{
    private String name;
    private int age;

//    Creating Getters for this class
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }


//    Creating Setters for this class
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }


    public void studentDetails(){
        System.out.println("Name: " + getName() + "\nAge: " + getAge());
    }
}




//Create a class Student with two private fields: name and age.
//Write getter and setter methods for both fields.
//In the main method, create an object of Student, set the values, and print them.
//Goal: Understand private variables and getters/setters.