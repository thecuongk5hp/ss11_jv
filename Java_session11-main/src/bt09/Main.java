package bt09;

class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingAccount savingAccount = new SavingAccount("SA123", 1000.0);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 500.0);

        bank.addAccount(savingAccount);
        bank.addAccount(checkingAccount);

        savingAccount.deposit(500);
        savingAccount.withdraw(300);
        checkingAccount.withdraw(100000);
        checkingAccount.deposit(200);

        bank.displayBalance();
    }
}
