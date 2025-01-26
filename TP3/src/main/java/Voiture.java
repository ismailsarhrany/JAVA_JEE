public class Voiture extends Vehicule{

    private int nombrePortes;

    // Constructeur
    public Voiture(int id, String modele, int autonomieBatterie,Boolean estDesponible, int nombrePortes) {
        super( id , modele,  autonomieBatterie, estDesponible);
        this.nombrePortes = nombrePortes;
    }

    // toString
    @Override
    public String toString() {
        return "Voiture [ID=" + getId() + ", Modèle=" + getModele() + ", Autonomie=" + getAutonomieBatterie() + " km, Portes=" + nombrePortes + ", Disponible=" + (isEstDesponible()? "Oui" : "Non") + "]";
    }

}
