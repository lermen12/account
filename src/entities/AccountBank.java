package entities;

public class AccountBank {

    private int account;
    private String name;
    public double deposit;

    public AccountBank() {
    }

    public AccountBank(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public AccountBank(int account, String name, double deposit) {
        this.account = account;
        this.name = name;
        this.deposit = deposit;
    }


    public void addDeposit(double deposit) {
        this.deposit += deposit;
    }

    public void removeDeposit(double deposit) {
        this.deposit -= deposit + 5;
    }
}
