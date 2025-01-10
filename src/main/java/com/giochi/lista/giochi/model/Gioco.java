package com.giochi.lista.giochi.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data // Lombok annotazione per generare automaticamente i metodi getter e setter per i campi della classe delle entità
public class Gioco {
    private Long id;
    private String titolo;
    private String genere;
    private int annoUscita;
    private String piattaforma;

}
