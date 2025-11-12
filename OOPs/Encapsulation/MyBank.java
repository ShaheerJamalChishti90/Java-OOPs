public class MyBank {
    public static void main(String[] args) {
        BankAccount ubl = new BankAccount(12345, 75000);
//        ubl.showDetails();
//        ubl.deposit(5000);
        ubl.withdraw(5000);
        ubl.showDetails();
        ubl.deposit(30000);
        ubl.showDetails();
    }
}


class BankAccount{
    private int accountNumber;
    private int balance;

    BankAccount(int accountnumber, int accountbalance){
        this.accountNumber = accountnumber;
        this.balance = accountbalance;
    }

    public int deposit(int amount){
        return this.balance += amount;
    }

    public int withdraw(int amount){
        return this.balance -= amount;
    }

    public int getBalance(){
        return this.balance;
    }

    public void showDetails(){
        System.out.println("Current Balance: " + this.accountNumber + "\nCurrent Balance: " + getBalance());
    }
}

//Create a class BankAccount with private fields: accountNumber, balance
//A constructor to initialize the account number and balance.
//A deposit(double amount) and withdraw(double amount) method that modify balance safely.
//A getBalance() method that returns current balance.
//Goal: Apply encapsulation with some data validation logic.