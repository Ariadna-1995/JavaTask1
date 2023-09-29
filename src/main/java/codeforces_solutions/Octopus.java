package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;

public class Octopus extends Animal implements Swimmable{
    public Octopus(String name, double weight) {
        super(name);
    }
    @Override
    public void toGo() {}

    @Override
    public void fly() {}

    @Override
    public int getSwimmingSpeed() {
        return 100;
    }
}