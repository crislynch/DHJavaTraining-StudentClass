//Scrivere un programma che contenga una classe che definisce uno Studente che abbia come
// proprietà nome, cognome ed identificativo.

//Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
//Nel main dichiarare un oggetto di tipo Studente.
import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {
        Studente studente1 = new Studente("Gianmaria", "Rossi");
        System.out.println("Lo studente selezionato e': " + studente1.getNome() + ", " + studente1.getCognome() + ", " + studente1.getId());
    }
}