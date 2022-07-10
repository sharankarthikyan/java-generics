import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer bec = new SoccerPlayer("Bec");

//        Team adelaideCrows = new Team("Adelaide Crows");
//        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(bec);
//        System.out.println(adelaideCrows.numPlayers());

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("This won't work.");
//        stringTeam.addPlayer("no-one");

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Liverpool");
        soccerPlayerTeam.addPlayer(bec);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer gordon = new FootballPlayer("Gordon");
        melbourne.addPlayer(gordon);

        Team<FootballPlayer> hawthron = new Team<>("Hawthron");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthron.matchResults(fremantle, 1, 0);
        hawthron.matchResults(adelaideCrows, 3, 8);

        adelaideCrows.matchResults(fremantle, 2, 1);
//        adelaideCrows.matchResults(baseballPlayerTeam, 1, 1);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthron.getName() + ": " + hawthron.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthron));
        System.out.println(hawthron.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));
    }
}