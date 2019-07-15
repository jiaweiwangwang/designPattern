package MediatorPattern;

public interface Mediator {
    void add(Station station);
    void send(String message,Station country);
}
