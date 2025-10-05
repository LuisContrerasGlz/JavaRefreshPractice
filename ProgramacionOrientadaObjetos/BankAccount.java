package programacionorientadaobjetos;

public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) { // (6)
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Monto inválido para depósito");
            return;
        }
        balance += amount;
    }

    public double getBalance() { return balance; }
}
