public class BasketballPlayer extends Player {

    public BasketballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        addMinutes(48);
    }
}