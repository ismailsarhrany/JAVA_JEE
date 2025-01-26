public class Main2 {

        public static void main(String[] args) {

            // Création d'instances de différents types de véhicules
            Vehicule voiture1 = new Voiture(1, "Tesla Model 3", 350, true, 4);
            Vehicule voiture2 = new Voiture(2, "Renault Zoe", 200, true, 5);
            Vehicule camion1 = new Camion(3, "Camion Volvo", 500, true, 1000);
            Vehicule scooter1 = new Scooter(4, "Scooter Yamaha", 100, true, 50);

            // Création d'instances de clients
            Client client1 = new Client(1, "Alice", null);
            Client client2 = new Client(2, "Bob", null);

            // Création d'une instance de GestionParc
            GestionParc parc = new GestionParc();

            // Ajout des véhicules au parc (polymorphisme)
            parc.ajouterVehicule(voiture1);
            parc.ajouterVehicule(voiture2);
            parc.ajouterVehicule(camion1);
            parc.ajouterVehicule(scooter1);

            // Ajout des clients au parc
            parc.ajouterClient(client1);
            parc.ajouterClient(client2);

            // Affichage des véhicules disponibles avant location
            System.out.println("\nVéhicules disponibles avant location :");
            parc.afficherVehiculesDisponibles();

            // Location d'un véhicule pour le client1
            parc.affecterVehiculeAClient(client1, voiture1.getId());

            // Affichage des véhicules disponibles après location
            System.out.println("\nVéhicules disponibles après location :");
            parc.afficherVehiculesDisponibles();

            // Retour du véhicule par le client1
            parc.retourVehicule(client1);

            // Affichage des véhicules disponibles après le retour
            System.out.println("\nVéhicules disponibles après retour :");
            parc.afficherVehiculesDisponibles();

            // Affichage des informations des clients
            System.out.println("\nInformations des clients :");
            parc.afficherClients();

    }

}
