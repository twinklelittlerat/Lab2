public class Player {

    private String name;
    private int jerseyNumber;
    private int minutesPlayed;

    public Player(String n, int j) {
        name = n;
        jerseyNumber = j;
        minutesPlayed = 0;
    }

    public void print() {
        System.out.println(name + ": " + jerseyNumber);
    }

    public int getMinutesPlayed() {
        return minutesPlayed;
    }

    protected void addMinutes(int minutes) {
        minutesPlayed = minutesPlayed + minutes;
    }

    protected void changeJerseyNumber(int newNumber) {
        jerseyNumber = newNumber;
        System.out.println(name + " changes number to " + jerseyNumber);
    }
}