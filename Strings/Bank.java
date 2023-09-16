public class Bank {
    String name;
    long accountNo;
    double bal;

    double getBal() {
        return bal;
    }

    void deposit(double amount) {
        bal += amount;
    }

    void withdraw(double withdraw) {
        bal -= withdraw;
    }

    public static void main(String[] args) {
        Bank c1 = new Bank();
        c1.name = "Shubham";
        c1.accountNo = 1234;
        c1.bal = 200.0;
        c1.deposit(55000);
        c1.withdraw(200);

        System.out.println("Account Detail:  " + "\nName: " + c1.name + "\nAccount No: " + c1.accountNo
                + "\nCurrent Balance: " + c1.getBal());
    }
}
