package learn.spring.studentmanagementsystemcrud.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Entreprise")
public class Entreprise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name; // Corrigé : Nom de l'attribut en camelCase

    private String email;

    @OneToMany(mappedBy = "entreprise")
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // Getters et setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name; // Corrigé
    }

    public void setName(String name) { // Corrigé
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Constructeurs
    public Entreprise() {
    }

    public Entreprise(String name, String email,List<Student> students) { // Corrigé
        this.name = name; // Corrigé
        this.email = email;
        this.students = students;
    }
}
