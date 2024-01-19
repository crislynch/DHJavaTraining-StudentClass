import java.util.UUID;

// proprietà nome, cognome ed identificativo.
public class Studente {

    String nome, cognome, identificativo;

    public Studente(String nome, String cognome){
        this.nome = nome;
        this.cognome = cognome;
        this.identificativo = UUID.randomUUID().toString();
    }

    public String getId() {
        return identificativo;
    }
    public String getCognome() {
        return cognome;
    }
    public String getNome() {
        return nome;
    }
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(String identificativo) {
        this.identificativo = identificativo;
    }

}
