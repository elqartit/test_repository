package ci.model;

public class Etudiant extends Person {

    private String numeroMatricule;

    public Etudiant(String numeroMatricule) {
        super();
        this.numeroMatricule = numeroMatricule;
        System.out.println("constructor Etudaint");
    }

    public Etudiant(String nom, String prenom) {
        super(nom, prenom);
        System.out.println("constructor Etudaint");
    }

    public Etudiant(String nom, String prenom, int age, int id) {
        super(nom, prenom, age, id);
        System.out.println("constructor Etudaint");
    }

    @Override
    public String getSituationProfessionnelle() {
        System.out.println("getSitudagtion from Etudian");
        return "Etudiant au chomage";
    }

    @Override
    public String getSituationProfessionnelle(int age) {
        String stu = super.getSituationProfessionnelle(age);
        if (stu.equals("Au chaomge")) {
            System.out.println("etudiant au chamge");
        }
        // TODO Auto-generated method stub
        return stu;
    }

    public void afficherEtudiant() {
        super.afficher();
        System.out.println("numer matricule : " + this.numeroMatricule);
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeroMatricule == null) ? 0 : numeroMatricule.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        Etudiant other = (Etudiant) obj;
        if (numeroMatricule.equalsIgnoreCase(other.numeroMatricule))
            return true;
        return true;
    }

}
