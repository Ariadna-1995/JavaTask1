package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;
public class Pigeon extends Animal implements Flyable{
    public Pigeon(String name) {
        super(name);
    }
    @Override
    public void toGo() {}

    @Override
    public void swim() {}

    public int getFlightSpeed() {
        return 200;
    }
}
