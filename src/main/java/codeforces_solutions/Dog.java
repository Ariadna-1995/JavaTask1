package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;

public class Dog extends Animal implements Runnable{
    public Dog(String name, double weight, Owner owner, LocalDate birthDay, List<Vaccination> vaccinations, Color color) {
        super(name, weight, owner, birthDay, vaccinations, color);
    }


    @Override
    public void fly() {}

    @Override
    public int getRunningSpeed() {
        return 29;
    }

}