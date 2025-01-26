package learn.spring.studentmanagementsystemcrud.Controller;

import learn.spring.studentmanagementsystemcrud.Entity.Entreprise;
import learn.spring.studentmanagementsystemcrud.Entity.Student;
import learn.spring.studentmanagementsystemcrud.Service.EntrepriseService;
import learn.spring.studentmanagementsystemcrud.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StudentController {
    // A controller for student to handle requests
    private StudentService service;
    private final EntrepriseService entrepriseService;
    public StudentController(StudentService service,EntrepriseService entrepriseService) {

        this.service = service;
        this.entrepriseService = entrepriseService;
    }

//    @Autowired
//    private EntrepriseService entrepriseService;


    //get all students
    @RequestMapping("/students")
     String getAllStudents(Model model){ // create a model  to send data betn view and controller
        model.addAttribute("students",service.getAllStudents());
        model.addAttribute("entreprises", entrepriseService.getAllEntreprises());
        return "students"; // returns a students view which should be created inside templates
    }

    @RequestMapping("students/add")
    String addStudentForm(Model model){
        Student student = new Student(); // object to hold student data
        model.addAttribute("student",student);
        model.addAttribute("entreprises", entrepriseService.getAllEntreprises());
        return "add-student";
    }

    @PostMapping("students")
    String addStudent(@ModelAttribute("student") Student student, @RequestParam(required = false) Long entrepriseId) {
        if (entrepriseId != null) {
            Entreprise entreprise = entrepriseService.getEntrepriseById(entrepriseId);
            student.setEntreprise(entreprise);  // Wrap the single Entreprise in a List
        } else {
            student.setEntreprise(null);  // Empty list if no entrepriseId is provided
        }
        service.addStudent(student);
        return "redirect:/students";
    }



    @RequestMapping("students/remove/{id}")
    String deleteStudent(@PathVariable("id")long id, Model model) throws Exception{
        service.deleteStudent(id);
        return "redirect:/students";
    }

    @GetMapping("students/update/{id}")
    String updateStudentForm(@PathVariable("id")Long id, Model model) throws Exception{
        Student student = new Student();
        model.addAttribute("student", service.getStudentById(id));
//        model.addAttribute("entreprises", entrepriseService.getAllEntreprises());
        List<Entreprise> entreprises = entrepriseService.getAllEntreprises(); // Fetch entreprises
        model.addAttribute("entreprises", entreprises);
        return "update-student";
    }

    @PostMapping("students/{id}")
    String editStudent(@PathVariable Long id, @ModelAttribute("student") Student student, @RequestParam(required = false) Long entrepriseId) {
        Student existingStudent = service.getStudentById(id); // get existing student to update existing data

        existingStudent.setId(id);
        existingStudent.setfName(student.getfName());
        existingStudent.setlName(student.getlName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setIsIntern(student.getIsIntern());  // Use the getter here

        // If entrepriseId is not null, set the corresponding entreprise in the list
        if (entrepriseId != null) {
            Entreprise entreprise = entrepriseService.getEntrepriseById(entrepriseId);
            existingStudent.setEntreprise(entreprise); // Wrap the single entreprise in a list
        } else {
            existingStudent.setEntreprise(null); // Empty list if no entreprise selected
        }

        service.updateStudent(existingStudent); // Update the existing student
        return "redirect:/students";
    }




}
