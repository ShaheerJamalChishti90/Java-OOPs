package Beginning;

public class SwitchCase {
    public static void main(String[] args){
        int current_port = 200;
        boolean status = true;
        switch (current_port){
            case 200:
                System.out.printf("Port 200, Status: %s\n", status);
                break;
            case 400:
                System.out.printf("Port 400, Status: %s\n", status);
                break;
            case 504:
                System.out.printf("Port 504, Status: %s\n", status);
                break;
            default:
                System.out.println("We cant figure out the status of this port, we are sorry!");
        }
    }
}
