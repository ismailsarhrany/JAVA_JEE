public class Client {

    // Client attributes
    private int id ;
    private String nom;
    private Vehicule  vehiculeLoue ;

    // the parametric constructor

    public Client(int id, String nom, Vehicule vehiculeLoue) {
        this.id = id;
        this.nom = nom;
        this.vehiculeLoue = null;
    }

    // getters

    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;

    }
    public Vehicule getVehiculeLoue() {
        return vehiculeLoue;
    }

    // cars renting function
    public void louerVehicule(Vehicule vehicule) {
        if (vehicule.isEstDesponible()){
            this.vehiculeLoue = vehicule;
            vehicule.setEstDesponible(false);
        }else{
            System.out.println("Sorry the car is not available");
        }
    }

    // returning the rented cars
    public void returnVehicule() {
        if(vehiculeLoue != null) {
            vehiculeLoue.setEstDesponible(true);
            System.out.println(" the rented vehicule is " + vehiculeLoue);
            vehiculeLoue = null ;
        }else {
            System.out.println("Sorry you have no rented cars ");
        }
    }

    // dispalying the client infos

    public String toString() {
        return  "Id Client         : "+getId()+
                "\nClient Name     : "+getNom()+
                "\nClient Vehicule : "+getVehiculeLoue()+
                "\n";
    }

}
