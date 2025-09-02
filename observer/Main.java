import java.util.ArrayList;
import java.util.List;

interface Observer {
	void update(String message);
}

class User implements Observer {
	private String name;

	User(String name) {
		this.name = name;
	}

	public void update(String message) {
		System.out.println("Message send to " + name + " : " + message);
	}
}

class NewsAgency {
	private List<Observer> observers = new ArrayList<>();
	private String news;

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}else {
			throw new IllegalArgumentException("Not Found !!!");
		}
	}

	public void sendNews(String news) {
		this.news = news;
		notifyAllObservers();
	}

	private void notifyAllObservers() {
		for (Observer observer : observers) {
			observer.update(news);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		User user = new User("Jack");
		User user2 = new User("Baki");
		User user3 = new User("Yujiro");

		NewsAgency newsAgency = new NewsAgency();
		newsAgency.addObserver(user);
		newsAgency.addObserver(user2);
		newsAgency.addObserver(user3);

		newsAgency.sendNews("Hello my friends");
	}
}