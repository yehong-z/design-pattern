package Mediator;

// 具体同事类B
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("ConcreteColleagueB received message: " + message);
    }

    public void send(String message) {
        mediator.send(message, this);
    }
}