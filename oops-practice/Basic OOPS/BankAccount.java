class BankAccount {
    int accountNumber;
    String holder;
    double balance;

    static int totalAccounts = 0;

    BankAccount(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(holder + " deposited ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(holder + " withdrew ₹" + amount);
        } else {
            System.out.println("Insufficient balance for " + holder);
        }
    }

    void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + holder);
        System.out.println("Balance        : ₹" + balance);
    }

    public static void main(String[] args) {

        BankAccount a1 = new BankAccount(101, "Rahul", 10000);
        BankAccount a2 = new BankAccount(102, "Aman", 15000);
        BankAccount a3 = new BankAccount(103, "Priya", 20000);

        // Account 1 - 5 Transactions
        a1.deposit(2000);
        a1.withdraw(1000);
        a1.deposit(500);
        a1.withdraw(3000);
        a1.withdraw(20000);

        // Account 2 - 5 Transactions
        a2.deposit(1000);
        a2.withdraw(2000);
        a2.deposit(3000);
        a2.withdraw(500);
        a2.deposit(2500);

        // Account 3 - 5 Transactions
        a3.withdraw(4000);
        a3.deposit(5000);
        a3.withdraw(1000);
        a3.deposit(1500);
        a3.withdraw(3000);

        // Statements
        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}