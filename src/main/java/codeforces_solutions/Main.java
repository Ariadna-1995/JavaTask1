package codeforces_solutions;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic Happiness = new VetClinic();


        Happiness.addAnimal(new Cat("Oscar"),
        Happiness.addAnimal(new Dog("Josh")),
        Happiness.addAnimal(new Pigeon("Lucy")),
        Happiness.addAnimal(new Sparrow("Jack")),
        Happiness.addAnimal(new Octopus("Dave")),
        Happiness.addAnimal(new Rat("Remy")),
        Happiness.addAnimal(new Shark("Lenny")),
        Happiness.addAnimal(new Mouse("Jerry")),

        for (Animal r: Happiness.getRunnable()) {
            System.out.println(r + ", " + "Скорость: " + r.getRunningSpeed());
        }

        System.out.println("\nПлавающие животные:");
        for (Animal s : Happiness.getSwimmable()) {
            System.out.println(s + ", " + "Скорость: " + s.getSwimmingSpeed());
        }

        System.out.println("\nЛетающие животные:");
        for (Animal f : Happiness.getFlyable()) {
            System.out.println(f + ", " + "Скорость: " + f.getFlightSpeed());
        }
    }
}