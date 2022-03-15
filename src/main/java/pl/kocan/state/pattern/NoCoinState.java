package pl.kocan.state.pattern;

public class NoCoinState implements State {

    @Override
    public void insertTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Moneta została wrzucona!");
        coffeeMachine.state = new CoinInsertedState();
    }

    @Override
    public void pushTheButton(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuć monetę!");
    }

    @Override
    public void takeTheCup(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuć monetę!");
    }

    @Override
    public void returnTheCoin(CoffeeMachine coffeeMachine) {
        System.out.println("Wrzuć monetę!");
    }
}
