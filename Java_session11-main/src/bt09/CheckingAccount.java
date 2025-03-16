package bt09;

class CheckingAccount extends BankAccount {

    public CheckingAccount(String accountNumber, Double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < -100000000) {
            System.out.println("Bạn không được phép rút vượt mức -100tr");
        }else {
            setBalance(getBalance()-amount);
            System.out.println("Rut thành công!");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Số tiền nạp không hợp lệ!");
        }else {
            setBalance(getBalance()+amount);
            System.out.println("Nạp tiền vào tài khoản thành công!");
        }
    }

    @Override
    public void displayBalance() {
        System.out.println("Số dư hiện tại trong tài khoản là: " + getBalance());
    }
}
