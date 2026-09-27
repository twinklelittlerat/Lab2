public class ClubTest {

    public static void main(String[] args) {

        SportsClub s = new SportsClub("Sports", 10);
        MarketingClub m = new MarketingClub("Marketing", 10, 500);

        s.addMember(5);
        m.addMember(5);

        s.advertise();
        m.advertise();

        System.out.println(s.determineBudget());
        System.out.println(m.determineBudget());

        System.out.println(m.useBudget(200));
        System.out.println(m.useBudget(400));
    }
}