public class AmateurPlayer extends Player {
    public AmateurPlayer(String name, int age, Sport sport) {
        super(name, age, sport);
    }

    @Override
    public double getSalary() {
        return 0;
    }
    @Override
    public String toString() {
        return super.toString() + ", Salary: 0";
    }
}
