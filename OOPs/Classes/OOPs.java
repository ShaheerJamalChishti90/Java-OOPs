class Car {
    String company;
    String color;
    String wheelDrive;
    long price;

    public void Details(){
        System.out.printf("Manufacturer: %s\nColor: %s\nWheel Drive: %s\nPrice: %d", this.company, this.color, this.wheelDrive, this.price);
    }

}

public class OOPs {
    public static void main(String[] args) {
        Car mehran = new Car();
        mehran.company = "Suzuki";
        mehran.color = "Silver";
        mehran.wheelDrive = "RWD";
        mehran.price = 2000000;

        Car corolla = new Car();
        corolla.company = "Toyota";
        corolla.color = "White";
        corolla.wheelDrive = "AWD";
        corolla.price = 30000000;

        mehran.Details();
        corolla.Details();
    }
}
