public class Subscriber {
    private String subscriberName;
    private String phoneNumber;
    private double accountBalance;
    private Tariff tariff;

    public Subscriber(String subscriberName, String phoneNumber, double accountBalance) {
        this.subscriberName = subscriberName;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public Tariff getTariff() {
        return tariff;
    }

    public void setTariff(Tariff tariff) {
        this.tariff = tariff;
    }

    public void replenishAccount(double amount) {
        accountBalance += amount;
    }
}