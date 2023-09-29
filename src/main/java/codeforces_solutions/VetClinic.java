package codeforces_solutions;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> patients;

    public VetClinic() {
        this.patients = new ArrayList<>();
    }

    public List<Animal> getAllPatients() {
        return patients;
    }

    public List<Animal> getRunnable() {
        List<Animal> runnableAnimals = new ArrayList<>();
        for (Animal animal : runnableAnimals) {
            if (animal instanceof Runnable) {
                runnableAnimals.add(animal);
            }
        }
        return runnableAnimals;
    }

    public List<Animal> getSwimmable() {
        List<Animal> swimmableAnimals = new ArrayList<>();
        for (Animal animal : swimmableAnimals) {
            if (animal instanceof Swimmable) {
                swimmableAnimals.add(animal);
            }
        }
        return swimmableAnimals;
    }

    public List<Animal> getFlyable() {
        List<Animal> flyableAnimals = new ArrayList<>();
        for (Animal animal : flyableAnimals) {
            if (animal instanceof Flyable) {
                flyableAnimals.add(animal);
            }
        }
        return flyableAnimals;
    }


    public VetClinic addAnimal(Animal animal) {
        this.patients.add(animal);
        return this;
    }
}

