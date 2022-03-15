package pl.kocan.state.pattern;

public class CoinInsertedState implements State {

    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta została już wrzucona!");
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Nalewam kawę!");
        coffeeMachine.state = new CupFullState();
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Wciśnij guzik!");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Zwracam monetę");
        coffeeMachine.state = new NoCoinState();
    }
}
