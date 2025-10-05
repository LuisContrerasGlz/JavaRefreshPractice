package EjemplosHerencia;

class SavingsAccount extends Account {
    private double interestRate; // ej. 0.05 = 5%

    public SavingsAccount(double initial, double interestRate) {
        super(initial);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }
}
