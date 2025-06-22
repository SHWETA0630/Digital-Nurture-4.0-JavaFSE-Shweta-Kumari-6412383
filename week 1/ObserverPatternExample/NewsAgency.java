package ObserverPatternExample;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(String news) {
        for (Observer o : observers) {
            o.update(news);
        }
    }

    public void publishNews(String news) {
        System.out.println("NewsAgency: " + news);
        notifyObservers(news);
    }
}
