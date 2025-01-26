//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //  Creating a book instance
        Livre livre1 = new Livre("if he had been with me ", "laura nowlin", "2013");
        Livre livre2 = new Livre("if I had told her ", "laura nowlin", "2014");
        Livre livre3 = new Livre("shatter me ","taherh miafi","2014");
        bibliotheque bibliotheque = new bibliotheque();
        bibliotheque.addLivre(livre1);
        bibliotheque.addLivre(livre2);
        bibliotheque.displaybook();
        bibliotheque.searchbook(livre3);
        bibliotheque.searchbook(livre2);
    }
}