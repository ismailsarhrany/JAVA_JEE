package learn.spring.studentmanagementsystemcrud.Service;

import learn.spring.studentmanagementsystemcrud.Entity.Entreprise;
import learn.spring.studentmanagementsystemcrud.repository.EntrepriseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // letting it to be known as a service
public class EntrepriseServiceImpl implements EntrepriseService {
    private final EntrepriseRepository entrepriseRepository;

    // Constructor-based injection
    public EntrepriseServiceImpl(EntrepriseRepository entrepriseRepository) {
        this.entrepriseRepository = entrepriseRepository;
    }

    @Override
    public List<Entreprise> getAllEntreprises() {
        return entrepriseRepository.findAll(); // Correct implementation
    }

    @Override
    public Entreprise getEntrepriseById(Long id) {
        return entrepriseRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Entreprise not found with ID: " + id));
    }

    @Override
    public Entreprise addEntreprise(Entreprise entreprise) {
        return entrepriseRepository.save(entreprise);
    }

    @Override
    public void deleteEntreprise(Long id) {
        if (!entrepriseRepository.existsById(id)) {
            throw new IllegalArgumentException("Cannot delete. Entreprise not found with ID: " + id);
        }
        entrepriseRepository.deleteById(id);
    }

    @Override
    public Entreprise updateEntreprise(Entreprise entreprise) {
        if (!entrepriseRepository.existsById(entreprise.getId())) {
            throw new IllegalArgumentException("Cannot update. Entreprise not found with ID: " + entreprise.getId());
        }
        return entrepriseRepository.save(entreprise);
    }
}
