public class Livre {
    // Defining the attributes
    String title ;
    String author ;
    String publicationYear ;

    // constructor

    Livre(String title, String author, String publicationYear) {

        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    // displaying the book's details
    public void afficherDetails() {
        System.out.println("Title : " + title);
        System.out.println("author : " +author );
        System.out.println("publicationYear : " + publicationYear);
    }


}


