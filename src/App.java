import java.util.ArrayList;
import java.util.List;

import ci.model.Person;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Start ...");

        Person p1 = new Person("Akele", "Morad", 33, 22);

        p1.setPrenom("Mourad");

        // System.out.println(p1.getPrenom());

        p1.afficher();
        String situation = p1.getSituationProfessionnelle(15);
        // System.out.println(situation);

        Person p2 = new Person("Akele2", "Morad2");
        p2.afficher();
        Person p3 = new Person("Akele2", "Morad2");
        p3.afficher();

        Person[] persons = new Person[3];
        persons[0] = p1;
        persons[1] = p2;
        persons[2] = p3;
        /*
         * for (Person person : persons) {
         * person.afficher();
         * }
         */
        List<String> maListe = new ArrayList<>();
        maListe.add("element1");
        maListe.add("element2");
        maListe.add("element3");

        for (String var : maListe) {
            System.out.println(var);
        }

        System.out.println(maListe.size());

    }
}
