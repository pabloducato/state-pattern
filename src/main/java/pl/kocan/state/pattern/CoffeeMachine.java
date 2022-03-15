package pl.kocan.state.pattern;

public class CoffeeMachine {

    State state;

    public CoffeeMachine() {
        this.state = new NoCoinState();
    }

    public void insertTheCoin() {

        state.insertTheCoin(this);
    }

    public void pushTheButton() {

        state.pushTheButton(this);
    }

    public void takeThCup() {

        state.takeTheCup(this);
    }

    public void returnTheCoin() {

        state.returnTheCoin(this);
    }

}
