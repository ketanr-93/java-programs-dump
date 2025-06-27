package test_project;

public class Bank {

    class Account
    {
        public void printAccountDetails() {
            System.out.println("Account details");
        }

    }

    public void callingMethod() {
        Account account = new Account();
        account.printAccountDetails();
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.callingMethod();

    }
}
