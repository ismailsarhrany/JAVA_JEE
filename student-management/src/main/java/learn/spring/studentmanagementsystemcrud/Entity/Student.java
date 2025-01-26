package learn.spring.studentmanagementsystemcrud.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name", nullable = false)
    private String fName;

    @Column(name = "last_name", nullable = false)
    private String lName;

    private String email;

    @Column(name = "is_intern", nullable = false)
    private Boolean isIntern = false;

    @ManyToOne
    @JoinColumn(name = "entreprise_id")
    private Entreprise entreprise;  // List of Entreprise for the many-to-many relationship

    // Add getters and setters for new fields
    public Boolean getIsIntern() {
        return isIntern != null ? isIntern : false;
    }

    public void setIsIntern(Boolean intern) {
        isIntern = intern != null ? intern : false;
    }

    // Getter for List<Entreprise>
    public Entreprise getEntreprise() {
        return entreprise;
    }

    // Setter for List<Entreprise>
    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Constructors
    public Student() {
        this.isIntern = false;
    }

    public Student(String fName, String lName, String email, Boolean isIntern, Entreprise entreprise) {
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.isIntern = isIntern != null ? isIntern : false;
        this.entreprise = entreprise;
    }
}
