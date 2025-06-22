package ObserverPatternExample;

public class Main {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Observer channel1 = new NewsChannel("NDTV");
        Observer channel2 = new NewsChannel("Aaj Tak");

        agency.addObserver(channel1);
        agency.addObserver(channel2);

        agency.publishNews("Heavy rains expected in Bengaluru.");
        agency.publishNews("India wins the cricket match!");
    }
}
