package yauhen_nohach.lesson8_oop_principles.lesson;

public class Account {
    public static final int COUNT = 6;

    private AccountType accountType;

    public Account(AccountType accountType) {
        this.accountType = accountType;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountType='" + accountType + '\'' +
                '}';
    }
}
