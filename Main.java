public class Main {
    public static void main(String[] args) {

        Magasin m1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin m2 = new Magasin(2, "Monoprix", "Menzah 6");

        m1.ajouterEmploye(new Caissier(1, "Ali", "Tunis", 170, 3));
        m1.ajouterEmploye(new Caissier(2, "Sami", "Ariana", 185, 1));
        m1.ajouterEmploye(new Vendeur(3, "Maha", "Ben Arous", 160, 12));
        m1.ajouterEmploye(new Responsable(4, "Rania", "Tunis", 165, 200));

        m2.ajouterEmploye(new Caissier(5, "Karim", "Tunis", 150, 2));
        m2.ajouterEmploye(new Vendeur(6, "Sarra", "Ariana", 120, 8));
        m2.ajouterEmploye(new Vendeur(7, "Lina", "Manar", 140, 15));
        m2.ajouterEmploye(new Vendeur(8, "Nader", "Tunis", 100, 5));
        m2.ajouterEmploye(new Responsable(9, "Fares", "Menzah", 170, 300));

        m1.ajouterProduit(new Produit(1, "Lait", 2.5));
        m1.ajouterProduit(new Produit(2, "Pain", 0.5));

        m2.ajouterProduit(new Produit(3, "Beurre", 4.2));
        m2.ajouterProduit(new Produit(4, "Jus", 3.1));

        m1.afficherDetails();
        m2.afficherDetails();
    }
}
