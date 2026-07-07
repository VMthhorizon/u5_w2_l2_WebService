package vincenzomola.u5_w2_l2_WebService.payloads;

public class BlogPostsResponsePayload {
    private long id;
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;
    private String cover;

    public BlogPostsResponsePayload(int tempoDiLettura, String contenuto, String titolo,
                                    String categoria) {
        this.id = id;
        this.cover = cover;
        this.tempoDiLettura = tempoDiLettura;
        this.contenuto = contenuto;
        this.titolo = titolo;
        this.categoria = categoria;
    }

    public String getContenuto() {
        return contenuto;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getTempoDiLettura() {
        return tempoDiLettura;
    }

    @Override
    public String toString() {
        return "BlogPostsResponsePayload{" +
                "id=" + id +
                ", categoria='" + categoria + '\'' +
                ", titolo='" + titolo + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", tempoDiLettura=" + tempoDiLettura +
                ", cover='" + cover + '\'' +
                '}';
    }
}
