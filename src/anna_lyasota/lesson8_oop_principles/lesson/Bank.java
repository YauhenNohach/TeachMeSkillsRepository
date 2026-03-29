package anna_lyasota.lesson8_oop_principles.lesson;

public class Bank implements IBank{
    String name;
    double transferFeePercent;

    //7) если банки аккаунтов отличаются, то снимать комиссию за перевод указанную банком(поле transferFeePercent)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTransferFeePercent() {
        return transferFeePercent;
    }

    public void setTransferFeePercent(double transferFeePercent) {
        this.transferFeePercent = transferFeePercent;
    }


    @Override
    public void deposit(double amount) {

    }
}
