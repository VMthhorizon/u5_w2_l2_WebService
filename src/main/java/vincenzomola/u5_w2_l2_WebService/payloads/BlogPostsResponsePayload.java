package vincenzomola.u5_w2_l2_WebService.payloads;

public class BlogPostsResponsePayload {
    private long id;
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;
    private String cover;

    public BlogPostsResponsePayload(long id, String categoria, String titolo, String contenuto, int tempoDiLettura,
                                    String cover) {
        this.id = id;
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        this.cover = cover;
    }

    public long getId() {
        return id;
    }

    public String getCover() {
        return cover;
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

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setTempoDiLettura(int tempoDiLettura) {
        this.tempoDiLettura = tempoDiLettura;
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
