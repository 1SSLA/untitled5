import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private List<Tariff> tariffs;

    public Company(String companyName) {
        this.companyName = companyName;
        this.tariffs = new ArrayList<>();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Tariff> getTariffs() {
        return tariffs;
    }

    public void addTariff(Tariff tariff) {
        tariffs.add(tariff);
        tariff.setCompany(this);
    }

    public Subscriber searchSubscriberByPhoneNumber(String phoneNumber) {
        for (Tariff tariff : tariffs) {
            for (Subscriber subscriber : tariff.getSubscribers()) {
                if (subscriber.getPhoneNumber().equals(phoneNumber)) {
                    return subscriber;
                }
            }
        }
        return null;
    }
}
