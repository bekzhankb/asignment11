public abstract class Player {
    protected String name;
    protected int age;
    protected Sport sport;

    public Player(String name, int age, Sport sport) {
        this.name = name;
        this.age = age;
        this.sport = sport;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public Sport getSport() { return sport; }

    public abstract double getSalary();

    @Override
    public String toString() {
        return name + ", Age: " + age + ", Sport: " + sport.getName();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player p = (Player) o;
        return name.equals(p.name) && age == p.age;
    }
    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}

