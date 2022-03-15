package pl.kocan.state.pattern;

public class Main {

    public static void main(String[] args) {

        CoffeeMachine coffeeMachine = new CoffeeMachine();

        coffeeMachine.insertTheCoin();
        coffeeMachine.pushTheButton();
        coffeeMachine.takeThCup();
        coffeeMachine.returnTheCoin();
    }
}
