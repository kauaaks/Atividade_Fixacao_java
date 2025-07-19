package Entities;

public class Account {
    private int number;
    private String name;
    private double balance;

    public Account(){
    }

    public Account(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public Account(int number, String name, double initialDeposit) {
        this.number = number;
        this.name = name;
        deposit(initialDeposit);
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        balance += value;
    }

    public void withdraw(double value){
        balance -= value + 5.0;
    }

    public String toString(){
        return "Account "
                + number +
                ", Holder: "
                +name+
                ", Balance: $ "
                +String.format("%.2f",balance);
    }
}
