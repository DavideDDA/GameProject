package com.giochi.lista.giochi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.giochi.lista.giochi.DTO.GiochiDTO;
import com.giochi.lista.giochi.model.Gioco;
import com.giochi.lista.giochi.services.GiocoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController // Annotazione per dichiarare la classe come controller
@RequestMapping("/giochi") // Annotazione per definire il percorso di base per le richieste HTTP
public class GiocoController {
    @Autowired
    private GiocoService giocoService;

    @PostMapping
    public Gioco aggiungiGioco(@RequestBody Gioco gioco) {
        return giocoService.saveGioco(gioco);
    }

    @GetMapping("/titolo")

    public List<Gioco> cercaGiocoPerTitolo(String titolo) {
        return giocoService.searchByTitle(titolo);
    }

    @GetMapping("/genere")
    public List<Gioco> cercaGiocoPerGenere(String genere) {
        return giocoService.searchByGenre(genere);
    }

    @GetMapping("/{id}")
    public Gioco getGiocoById(@PathVariable Integer id) {
        return giocoService.getGiocoById(id);
    }

    @GetMapping
    public List<GiochiDTO> getAll() {
        return giocoService.getAllGiochi();
    }

    @DeleteMapping("/{id}")
    public void deleteGioco(@PathVariable Integer id) {
        giocoService.deleteGioco(id);
    }

}
