public class Caissier extends Employe {
    private int numeroCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeures, int numeroCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.numeroCaisse = numeroCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 5;
        if (nbrHeures > 180) {
            salaire += (nbrHeures - 180) * 5 * 0.15; // heures sup
        }
        return salaire;
    }

    @Override
    public String toString() {
        return "Caissier: " + super.toString() + ", Caisse=" + numeroCaisse;
    }
}
