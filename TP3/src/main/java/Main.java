//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Creating Vehicule instances
        Vehicule vehicule1 = new Vehicule(1, "Tesla Model 3", 350, true);
        Vehicule vehicule2 = new Vehicule(2, "Nissan Leaf", 150, true);
        Vehicule vehicule3 = new Vehicule(3, "BMW i3", 200, true);

        // Creating Client instances
        Client client1 = new Client(1, "Alice", null);
        Client client2 = new Client(2, "Bob", null);

        // Creating  the ParK instance
        GestionParc parc = new GestionParc();

        // Adding the cars to the park vehicules
        parc.ajouterVehicule(vehicule1);
        parc.ajouterVehicule(vehicule2);
        parc.ajouterVehicule(vehicule3);
        System.out.println();

        // Adding the client  to the park clients
        parc.ajouterClient(client1);
        parc.ajouterClient(client2);
        System.out.println();

        //  Displaying the available cars before the rent
        System.out.println("Available cars before the rent:");
        parc.afficherVehiculesDisponibles();
        System.out.println();

        // Rent the first car to the first client
        parc.affecterVehiculeAClient( client1,vehicule1.getId());
        System.out.println();

        // Displaying available cars after the rent
        System.out.println("Available cars after the rent :");
        parc.afficherVehiculesDisponibles();
        System.out.println();

        //  the first client retourned the rented car
        parc.retourVehicule(client1);
        System.out.println();

        // Displaying the available cars after the returned cars
        System.out.println("Available cars after the return :");
        parc.afficherVehiculesDisponibles();
        System.out.println();

        // Displaying client's credentials
        System.out.println("Client's credentials");
        parc.afficherClients();

    }


}
