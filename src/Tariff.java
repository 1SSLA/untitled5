import java.util.ArrayList;
import java.util.List;

public class Tariff {
    private String tariffName;
    private Company company;
    private List<Subscriber> subscribers;

    public Tariff(String tariffName) {
        this.tariffName = tariffName;
        this.subscribers = new ArrayList<>();
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Subscriber> getSubscribers() {
        return subscribers;
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        subscriber.setTariff(this);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
        subscriber.setTariff(null);
    }

    public int getNumberOfSubscribers() {
        return subscribers.size();
    }
}
