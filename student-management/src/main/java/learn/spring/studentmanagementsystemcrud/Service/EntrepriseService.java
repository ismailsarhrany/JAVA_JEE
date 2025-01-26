package learn.spring.studentmanagementsystemcrud.Service;

import learn.spring.studentmanagementsystemcrud.Entity.Entreprise;

import java.util.List;

public interface EntrepriseService {
    // Récupérer toutes les entreprises
    List<Entreprise> getAllEntreprises();

    // Récupérer une entreprise par ID
    Entreprise getEntrepriseById(Long id);

    // Ajouter une nouvelle entreprise
    Entreprise addEntreprise(Entreprise entreprise);

    // Supprimer une entreprise par ID
    void deleteEntreprise(Long id);

    // Mettre à jour une entreprise existante
    Entreprise updateEntreprise(Entreprise entreprise);
}
