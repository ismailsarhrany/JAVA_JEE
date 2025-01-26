public class Scooter extends Vehicule{
    private int capaciteChargement;

    //Constructeur
    public Scooter(int id, String modele, int autonomieBatterie,Boolean estDesponible, int capaciteChargement){
        super( id , modele,  autonomieBatterie, estDesponible);
        this.capaciteChargement=capaciteChargement;
    }

    //toString

    @Override
    public String toString() {
        return "Camion [ID: "+getId()+"\nModele: "+getModele()+"\nAutonomie de la batterie: "+getAutonomieBatterie()+"\ncapaciteChargement: " + capaciteChargement + "kg, Disponible : "+((isEstDesponible())? "Oui":"Non")+"]";
    }
}
