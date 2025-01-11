package com.giochi.lista.giochi.DTO;

public class GiochiDTO {
    private String titolo;
    private String genere;

    public GiochiDTO(String titolo, String genere) {
        this.titolo = titolo;
        this.genere = genere;
    }

    public String getTitolo() {
        return titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
