package learn.spring.studentmanagementsystemcrud.Controller;

import learn.spring.studentmanagementsystemcrud.Entity.Entreprise;
import learn.spring.studentmanagementsystemcrud.Service.EntrepriseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/entreprises") // Regrouper les chemins sous un préfixe commun
public class EntrepriseController {
    private final EntrepriseService service;

    public EntrepriseController(EntrepriseService service) {
        this.service = service;
    }

    @GetMapping
    public String getAllEntreprises(Model model) {
        model.addAttribute("entreprises", service.getAllEntreprises()); // Utilisation cohérente de "entreprises"
        return "entreprises"; // Assurez-vous que le fichier HTML est "entreprises.html"
    }

    @GetMapping("/add")
    public String addEntrepriseForm(Model model) {
        model.addAttribute("entreprise", new Entreprise());
        return "add-entreprise"; // Nom cohérent avec le fichier HTML
    }

    @PostMapping
    public String addEntreprise(@ModelAttribute("entreprise") Entreprise entreprise) {
        service.addEntreprise(entreprise);
        return "redirect:/entreprises";
    }

    @GetMapping("/update/{id}")
    public String updateEntrepriseForm(@PathVariable Long id, Model model) {
        Entreprise entreprise = service.getEntrepriseById(id);
        model.addAttribute("entreprise", entreprise);
        return "update-entreprise"; // Nom cohérent avec le fichier HTML
    }

    @PostMapping("/{id}")
    public String updateEntreprise(@PathVariable Long id, @ModelAttribute("entreprise") Entreprise entreprise) {
        Entreprise existingEntreprise = service.getEntrepriseById(id);
        existingEntreprise.setName(entreprise.getName());
        existingEntreprise.setEmail(entreprise.getEmail());
        service.updateEntreprise(existingEntreprise);
        return "redirect:/entreprises";
    }

    @GetMapping("/remove/{id}")
    public String deleteEntreprise(@PathVariable Long id) {
        service.deleteEntreprise(id);
        return "redirect:/entreprises";
    }
}

