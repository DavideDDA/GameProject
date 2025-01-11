package com.giochi.lista.giochi.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data // Lombok annotazione per generare automaticamente i metodi getter e setter per
      // i campi della classe delle entità
public class Gioco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Nonnull
    private String titolo;
    private String genere;
    private int annoUscita;
    private String piattaforma;

}
