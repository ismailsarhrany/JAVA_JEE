import java.util.ArrayList;

public class GestionParc {

    //Park attributes
    private ArrayList<Vehicule> listVehicules;
    private ArrayList<Client> listClients;

    //construcor
    public GestionParc() {
        this.listVehicules = new ArrayList();
        this.listClients = new ArrayList();
    }

    // add a new car to the park

    public void ajouterVehicule(Vehicule vehicule) {
        this.listVehicules.add(vehicule);
        System.out.println(" vehicule has been added ");
    }

    //adding a new Client to the car
    public void ajouterClient(Client client) {
        this.listClients.add(client);
        System.out.println("the Client has been added ");
    }

    // renting the client a car if available

    public void affecterVehiculeAClient(Client client, int vehiculeId) {
        for (Vehicule vehicule :  listVehicules) {
            if (vehicule.getId() == vehiculeId) {
                client.louerVehicule(vehicule);
                return;
            }
        }
        System.out.println("Véhicule non trouvé.");
    }

    public void retourVehicule(Client client) {
        client.returnVehicule();
    }

    public void afficherVehiculesDisponibles() {
        System.out.println("Véhicules disponibles :");
        for (Vehicule vehicule : listVehicules) {
            if (vehicule.isEstDesponible()) {
                System.out.println(vehicule);
            }
        }
 }
 public void afficherClients() {
            System.out.println("Liste des clients :");
            for (Client client : listClients) {
                System.out.println(client);
            }
        }


}





