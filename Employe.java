public class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbrHeures;

    public Employe(int id, String nom, String adresse, int nbrHeures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public double calculerSalaire() {
        return 0;
    }

    @Override
    public String toString() {
        return "ID=" + id + ", Nom=" + nom + ", Adresse=" + adresse + ", Heures=" + nbrHeures;
    }
}
