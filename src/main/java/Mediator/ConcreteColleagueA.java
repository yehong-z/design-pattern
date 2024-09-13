package Mediator;

// 具体同事类A
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleagueA received message: " + message);
    }

    public void send(String message) {
        mediator.send(message, this);
    }
}
