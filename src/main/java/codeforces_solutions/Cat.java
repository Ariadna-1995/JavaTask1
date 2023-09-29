package codeforces_solutions;

public class Cat extends Animal implements Runnable{
    private String breed;

    public Cat(String name) {
        super(name, weight, owner, birthDay, vaccinations, color);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void fly() {
    }

    @Override
    public void swim() {
    }

    @Override
    public int getRunningSpeed() {
        return 9;
    }
}