package com.giochi.lista.giochi.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data // Lombok annotation to generate all the getters, setters, equals, hash, and
      // toString methods
public class Gioco {
    private Long id;
    private String titolo;
    private String genere;
    private int annoUscita;
    private String piattaforma;

}
