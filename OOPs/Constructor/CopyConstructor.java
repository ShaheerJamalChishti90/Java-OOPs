public class CopyConstructor {
    public static void main(String[] args) {

        MyCar mehran = new MyCar();
        mehran.color = "White";
        mehran.price = 3000000;

        MyCar c2 = new MyCar(mehran);
        c2.color = "Black";
        c2.price = 50000000;

        mehran.MyCarDetails();
        c2.MyCarDetails();

    }
}


// Copy Constructor: ye basically ek object ki properties ko doosray object mein copy kardeta hai

class MyCar{
    String color;
    int price;

    MyCar(){
        System.out.println("This is an empty constructor!");
    }

    MyCar(MyCar c2){
        this.color = c2.color;
        this.price = c2.price;
    }

    public void MyCarDetails(){
        System.out.println(this.color);
        System.out.println(this.price);
    }
}