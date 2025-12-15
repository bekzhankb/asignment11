public class Main {
    public static void main(String[] args) {
        Sport football = new Sport("Football", 1);
        Sport basketball = new Sport("Basketball", 2);

        Player p1 = new Player("Bekzhan", 18, football);
        Player p2 = new Player("Lamine Yamal", 18, football);
        Player p3 = new Player("Lebron James",40, basketball);
        Player p4 = new Player("Ayan", 28, basketball);

        SportsClub club = new SportsClub("Barcelona", "Lakers");

        System.out.println(football);
        System.out.println(basketball);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(club);

        System.out.println("p1 and p2 play the same sport? " + p1.getSport().equals(p2.getSport()));
        System.out.println("p2 and p4 play the same sport? " + p2.getSport().equals(p4.getSport()));
    }
}

class Sport {
    private String name;
    private int teamSize;

    public Sport(String name, int teamSize) {
        this.name = name;
        this.teamSize = teamSize;
    }

    public String getName() {return name;}
    public int getTeamSize() {return teamSize;}

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Sport: " + name + ", Team Size: " + teamSize;
    }
}

class Player {
    private String name;
    private int age;
    private Sport sport;

    public Player(String name, int age, Sport sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public String getName(){ return name;}
    public int getAge(int age) {return age;}
    public Sport getSport() {return sport;}

    public void setName(String name) {this.name=name;}
    public void setAge(int age) {this.age=age;}
    public void setSport(Sport sport){this.sport= sport;}

    @Override
    public String toString(){
        return "Player: " + name +", Age: " + age + " , Sport: " + sport.getName();
    }
}

class SportsClub {
    private String clubName;
    private String location;

    public SportsClub(String clubName, String location){
        this.clubName= clubName;
        this.location= location;
    }
    public String getClubName(){return clubName;}
    public String getLocation(){return location;}

    public void setClubName(String clubName){this.clubName=clubName;}
    public void setLocation(String  location){this.location=location;}

    @Override
    public String toString(){
        return "SportsClub: " + clubName + ", location: " + location;
    }
}
