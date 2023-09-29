package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;
public class Rat extends Animal implements Runnable{
    public Rat(String name) {

        super(name);
    }
    @Override
    public void fly() {}

    @Override
    public void swim() {}

    public int getRunningSpeed() {
        return 80;
    }


}
