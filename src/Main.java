//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Company company1 = new Company("Company 1");
        Company company2 = new Company("Company 2");

        Tariff tariff1 = new Tariff("ALTEL");
        Tariff tariff2 = new Tariff("ACTIV");

        Subscriber subscriber1 = new Subscriber("ISLAM", "123456789", 50.0);
        Subscriber subscriber2 = new Subscriber("AMIR", "987654321", 30.0);
        Subscriber subscriber3 = new Subscriber("DANIK", "111222333", 40.0);

        company1.addTariff(tariff1);
        company2.addTariff(tariff2);

        tariff1.addSubscriber(subscriber1);
        tariff1.addSubscriber(subscriber2);
        tariff2.addSubscriber(subscriber3);


        System.out.println("Subscribers of Company 1:");
        for (Tariff tariff : company1.getTariffs()) {
            for (Subscriber subscriber : tariff.getSubscribers()) {
                System.out.println("Name: " + subscriber.getSubscriberName() +
                        ", Phone Number: " + subscriber.getPhoneNumber() +
                        ", Balance: " + subscriber.getAccountBalance());
            }
        }


        subscriber2.replenishAccount(20.0);


        System.out.println("\nAfter Replenishing the Account of Subscriber 2:   ");
        for (Tariff tariff : company1.getTariffs()) {
            for (Subscriber subscriber : tariff.getSubscribers()) {
                System.out.println("Name: " + subscriber.getSubscriberName() +
                        ", Phone Number: " + subscriber.getPhoneNumber() +
                        ", Balance: " + subscriber.getAccountBalance());
            }
        }


        String phoneNumberToSearch = "987654321";
        Subscriber foundSubscriber = company2.searchSubscriberByPhoneNumber(phoneNumberToSearch);

        if (foundSubscriber != null) {
            System.out.println("\nFound Subscriber:");
            System.out.println("Name: " + foundSubscriber.getSubscriberName() +
                    ", Tariff: " + foundSubscriber.getTariff().getTariffName());
        } else {
            System.out.println("\nSubscriber not found.");
        }
    }
}