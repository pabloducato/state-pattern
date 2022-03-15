package pl.kocan.state.pattern;

public class CoffeeMachine {

    State state;

    public CoffeeMachine() {
        this.state = State.NO_COIN;
    }

    public void insertTheCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("Wrzucono monetę!");
                state = State.COIN_INSERTED;
                break;
            case COIN_INSERTED:
                System.out.println("Moneta już wrzucona!");
                break;
            case CUP_FULL:
                System.out.println("Zabierz najpierw kubek!");
                break;
        }
    }

    public void pushTheButton() {
        switch (state) {
            case NO_COIN:
                System.out.println("Brak monety!");
                break;
            case COIN_INSERTED:
                System.out.println("Nalewam kawę!");
                state = State.CUP_FULL;
                break;
            case CUP_FULL:
                System.out.println("Zabierz najpierw kubek!");
                break;
        }
    }

    public void takeThCup() {
        switch (state) {
            case NO_COIN:
                System.out.println("Brak monety!");
                break;
            case COIN_INSERTED:
                System.out.println("Wciśnij guzik!");
                break;
            case CUP_FULL:
                System.out.println("Zabrano kubek!");
                state = State.NO_COIN;
                break;
        }
    }

    public void returnTheCoin() {
        switch (state) {
            case NO_COIN:
                System.out.println("Brak monety!");
                break;
            case COIN_INSERTED:
                System.out.println("Zwracam monetę!");
                state = State.NO_COIN;
                break;
            case CUP_FULL:
                System.out.println("Za późno!");
                break;
        }
    }

    public enum State {
        NO_COIN,
        COIN_INSERTED,
        CUP_FULL
    }
}
