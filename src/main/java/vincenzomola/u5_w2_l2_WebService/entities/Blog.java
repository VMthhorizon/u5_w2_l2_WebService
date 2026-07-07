package vincenzomola.u5_w2_l2_WebService.entities;

import java.util.Random;

public class Blog {

    private long id;
    private String categoria;
    private String titolo;
    private String contenuto;
    private int tempoDiLettura;
    private String cover;

    public Blog(String categoria, String titolo, String contenuto, int tempoDiLettura) {
        this.categoria = categoria;
        this.titolo = titolo;
        this.contenuto = contenuto;
        this.tempoDiLettura = tempoDiLettura;
        Random random = new Random();
        this.id = random.nextInt(0, 10000);
        this.cover = "https://picsum.photos/200/300";
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

    public long getId() {
        return id;
    }

    public String getCover() {
        return cover;
    }
}
