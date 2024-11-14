package ci.model;

import java.util.ArrayList;
import java.util.List;

public class AppHeritage {

    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("12345596");
        Etudiant e2 = new Etudiant("12345597");
        Person p = new Person("Akele", "Morad", 33, 22);

        List<Person> persons = new ArrayList<>();
        persons.add(p);
        persons.add(e1);
        persons.add(e2);

        Affichage affichage = new Adresse();
        affichage.afficher();

        for (Person person : persons) {
            if (person.getAge() == 25) {
                System.out.println("Person agée de 25 ans");
            }

            if (person instanceof Etudiant) {
                ((Etudiant) person).afficherEtudiant();
            } else {
                person.afficher();
            }
        }

        boolean isEtudiantEquals = e1.equals(e2);

        String nom1 = "Elqartit23";

        String nom2 = "elQartit23";

        boolean isEquals = nom1.equalsIgnoreCase(nom2);

        // System.out.println(nom1.length());

    }
}
