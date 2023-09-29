package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;
public class Sparrow extends Animal implements Flyable{
    public Sparrow(String name) {

        super(name);
    }
    @Override
    public void toGo() {}

    @Override
    public void swim() {}

    @Override
    public int getFlightSpeed() {
        return 200;
    }
}
