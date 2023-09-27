package codeforces_solutions;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("", 8.0, new Owner("John"), LocalDate.now(), List.of(new Vaccination("chumka", LocalDate.now())),Color.BLACK, "");
        Animal pigeon = new Pigeon("Pigeon");
        pigeon.fly();
    }
}