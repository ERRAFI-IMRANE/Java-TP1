public class Employer {
    private String nom ;
    private int age ;
    private double salaire ;
    private String departement ;
    public Employer ( String nom , int age , double salaire , String departement ) {
        this . nom = nom ;
        this . age = age ;
        this . salaire = salaire ;
        this . departement = departement ;
    }   

    public String getName() {
        return this.nom;
    }

    public int getAge() {
        return this.age;
    }

    public double getsalaire() {
        return this.salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getDepartement() {
        return this.departement;
    }

    @Override
    public String toString() {
        return "salaire " + this.salaire;
    }

}


        