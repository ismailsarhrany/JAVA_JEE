public class Vehicule {

// Attribute declaration
    private int id ;
    private String modele ;
    private int autonomieBatterie;
    private boolean estDesponible ;


// Constructor
    public Vehicule(int id , String modele, int autonomieBatterie, boolean estDesponible) {
        this.id = id;
        this.modele = modele;
        this.autonomieBatterie = autonomieBatterie;
        this.estDesponible = true;  // by default estDesponible is true
    }
// getters and setters
    // id
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    //model
    public String getModele(){
        return modele;
    }
    public void setModele(String modele){
        this.modele = modele ;
    }
    // autonomieBatterie
    public int getAutonomieBatterie(){
        return autonomieBatterie;
    }
    public void setAutonomieBatterie(int autonomieBatterie){
        this.autonomieBatterie = autonomieBatterie;
    }

    // estSesponible
    public boolean isEstDesponible(){
        return estDesponible;
    }
    public void setEstDesponible(boolean estDesponible){
        this.estDesponible = estDesponible;
    }
// toString to display the different info about the cars
  public String toString(){
        return "Id Vehicule: "+getId()+
                "\nModele    : "+getModele()+
                "\nAutonomie : "+getAutonomieBatterie()+
                "\nEstDesponible : "+isEstDesponible()+
                "\n";

  }

}

