package vincenzomola.u5_w2_l2_WebService.payloads;

public class BlogPostsPayload {

    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;

    public BlogPostsPayload(String categoria, String titolo, String contenuto, int tempoDiLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getContenuto() {
        return contenuto;
    }

    public int getTempoDiLettura() {
        return tempoDiLettura;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public void setTempoDiLettura(int tempoDiLettura) {
        this.tempoDiLettura = tempoDiLettura;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public String toString() {
        return "BlogPostsPayload{" +
                "categoria='" + categoria + '\'' +
                ", titolo='" + titolo + '\'' +
                ", contenuto='" + contenuto + '\'' +
                ", tempoDiLettura=" + tempoDiLettura +
                '}';
    }
}
