package vincenzomola.u5_w2_l2_WebService.payloads;

public class AutoreResponsePayload {

    private long id;
    private String nome;
    private String cognome;
    private String email;
    private String dataDiNascita;
    private String avatar;

    public AutoreResponsePayload(long id, String nome, String cognome, String email, String dataDiNascita,
                                 String avatar) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiNascita = dataDiNascita;
        this.avatar = avatar;
    }

    @Override
    public String toString() {
        return "AutoreResponsePayload{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataDiNascita='" + dataDiNascita + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
