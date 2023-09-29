package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;

public class Shark extends Animal implements Swimmable{
    public Shark(String name, double weight) {

        super(name);
    }

    @Override
    public void toGo() {}

    @Override
    public void fly() {}

    @Override
    public int getSwimmingSpeed() {
        return 180;
    }
}