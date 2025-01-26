import java.util.ArrayList;
import java.util.List;


public class bibliotheque {
    // Arrylist of books
    private List<Livre> livres;

    // library constructor
    public bibliotheque() {
        this.livres = new ArrayList<>();
    }

    // adding a book method

    public void addLivre(Livre livre) {
        this.livres.add(livre);
    }

    // displaying books methode
    public void displaybook() {
        if (livres.isEmpty()) {
            System.out.println("the library is empty");
        } else {
            System.out.println("the library books are ");
            for (Livre livre : livres) {
                livre.afficherDetails();
                System.out.println();
            }
        }
    }

    public void searchbook (Livre livre){
        if (this.livres.contains(livre)) {
            System.out.println("the book is available");
        }else {
            System.out.println("the book is not available");
        }
    }


    }


