public class Produit {
    private int id;
    private String libelle;
    private double prix;

    public Produit(int id, String libelle, double prix) {
        this.id = id;
        this.libelle = libelle;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit: ID=" + id + ", Libelle=" + libelle + ", Prix=" + prix;
    }
}
