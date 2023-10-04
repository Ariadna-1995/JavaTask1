package seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {


        Set<Component> result = new HashSet<>();
        result.add(new Component("Пенициллин", "4", 10));
        result.add(new Component("Пенициллин", "4", 10));
        result.add(new Component("Азитрон", "2", 6));
        System.out.println(result + "\n");


        List<Component> componentsCat1 = List.of(
                new Penicillin("Пенициллин", "10", 3),
                new Water("Вода", "20", 10));
        List<Component> componentsCat2 = List.of(
                new Azitron("Азитрон", "10", 2),
                new Penicillin("Пенициллин", "3", 3));
        List<Component> componentsCat3 = List.of(
                new Water("Вода", "30", 10),
                new Azitron("Азитрон", "20", 30));


        CatDrug drug1 = new CatDrug(componentsCat1);
        CatDrug drug2 = new CatDrug(componentsCat2);
        CatDrug drug3 = new CatDrug(componentsCat3);


        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        System.out.println(drugs);


        Collections.sort(drugs);
        System.out.println(drugs);
    }
}

