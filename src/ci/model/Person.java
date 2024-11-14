package ci.model;

public class Person implements Affichage {
    private String nom;
    private String prenom;
    private int age;
    private int id;
    private static String uuid = "test23";

    public Person() {
        this("nom1", "prenom1");
        System.out.println("constructor sans param Person");
    }

    public Person(String n, String p) {
        this(n, p, 20, 23);
        System.out.println("Constructeur Person avec 2 param");
    }

    public Person(String nom, String prenom, int age, int id) {
        System.out.println("Constructeur Person avec 4 param");
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.id = id;
    }

    public String getSituationProfessionnelle() {
        System.out.println("getSituationProfessionnelle from Person");
        String situation = age < 25 ? "En emploi" : "Au chomage";
        return situation;
    }

    public String getSituationProfessionnelle(int age) {
        String situation = age < 25 ? "En emploi" : "Au chomage";
        return situation;
    }

    public static String getSituationStatic() {
        String situation = uuid != null ? "En emploi" : "Au chomage";
        return situation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public static String getUuid() {
        return uuid;
    }

    public static void setUuid(String uuid) {
        Person.uuid = uuid;
    }

    @Override
    public void afficher() {
        System.out.println("bonjour : " + this.nom);
    }

}
