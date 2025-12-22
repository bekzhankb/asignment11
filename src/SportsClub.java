import java.util.*;

public class SportsClub {
    private String clubName;
    private List<Player> players = new ArrayList<>();

    public SportsClub(String clubName) {
        this.clubName = clubName;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void sortByAge() {
        players.sort(Comparator.comparing(Player::getAge));
    }

    public List<Player> filterProfessionals() {
        List<Player> pros = new ArrayList<>();
        for (Player p : players) {
            if (p.getSalary() > 0) pros.add(p);
        }
        return pros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("SportsClub: " + clubName + "\n");
        for (Player p : players) {
            sb.append(p).append("\n");
        }
        return sb.toString();
    }
}
