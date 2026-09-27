public class FootballPlayer extends Player {

    public FootballPlayer(String n, int j) {
        super(n, j);
    }

    public void playGame() {
        addMinutes(90);
    }
}