package bt09;

class Bank {
    private BankAccount[] accounts = new BankAccount[10];
    private int count = 0;

    public void addAccount(BankAccount account){
        if (count >= accounts.length) {
            System.out.println("Số lượng tài khoản đã đủ");
        }else {
            accounts[count++] = account;
            System.out.println("Đã thêm tài khoản " + account.getAccountNumber() + " vao danh sách");
        }
    }

    public void displayBalance(){
        for (int i = 0; i < count; i++) {
            accounts[i].displayBalance();
        }
    }
}
