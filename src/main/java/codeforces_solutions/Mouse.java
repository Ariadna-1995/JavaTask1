package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;
public class Mouse extends Animal implements Runnable{
    public Mouse(String name) {
        super(name);
    }
    @Override
    public void fly() {}

    @Override
    public void swim() {}

    @Override
    public int getRunningSpeed() {
        return 67;
    }
}

