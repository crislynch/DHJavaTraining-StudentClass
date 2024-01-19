// proprietà nome, cognome ed identificativo.
public class Studente {
    public String nome;
    public String cognome;
    public int identificativo;

    public Studente(String nome, String cognome, int identificativo){
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = identificativo;
    }

    @Override //per convertire l'hash
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", identificativo=" + identificativo +
                '}';
    }
}
