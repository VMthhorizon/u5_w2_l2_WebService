package vincenzomola.u5_w2_l2_WebService.entities;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.Random;

public class Autore {

    private long id;
    private String nome;
    private String cognome;
    private String email;
    private String dataDiNascita;
    private String avatar;

    public Autore(String nome, String cognome, String email, String dataDiNascita) {
        Random random = new Random();
        this.id = random.nextInt(1, 10000);
        this.avatar = "https://ui-avatars.com/api?name=Mario+Rossi";
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
    }

    public long getId() {
        return id;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getEmail() {
        return email;
    }

    public String getDataDiNascita() {
        return dataDiNascita;
    }


    public void setDataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
