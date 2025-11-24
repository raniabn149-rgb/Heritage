import java.util.ArrayList;

public class Magasin {
    private int id;
    private String nom;
    private String adresse;

    private ArrayList<Produit> produits = new ArrayList<>();
    private ArrayList<Employe> employes = new ArrayList<>();

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public void ajouterProduit(Produit p) {
        produits.add(p);
    }

    public void ajouterEmploye(Employe e) {
        if (employes.size() < 20) {
            employes.add(e);
        } else {
            System.out.println("Capacité employés atteinte !");
        }
    }

    public void afficherDetails() {
        System.out.println("\n=== Magasin : " + nom + " ===");
        System.out.println("ID=" + id + ", Adresse=" + adresse);
        System.out.println("\n--- Produits ---");
        for (Produit p : produits) System.out.println(p);
        System.out.println("\n--- Employés ---");
        for (Employe e : employes) {
            System.out.println(e + " | Salaire=" + e.calculerSalaire() + " DT");
        }
    }
}
