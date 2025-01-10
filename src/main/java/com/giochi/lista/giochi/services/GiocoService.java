package com.giochi.lista.giochi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giochi.lista.giochi.model.Gioco;
import com.giochi.lista.giochi.repository.GiocoRepository;

@Service // Annotazione per dichiarare la classe come servizio
public class GiocoService {
    @Autowired // Annotazione per l'injecting delle dipendenze della classe repository, in modo
               // tale da utilizzare le funzioni di JPA
    private GiocoRepository giocoRepository;

    public Gioco saveGioco(Gioco gioco) {
        return giocoRepository.save(gioco);
    }

    public List<Gioco> searchByTitle(String titolo) {
        return giocoRepository.findByTitoloContaining(titolo);
    }

    public List<Gioco> searchByGenre(String genere) {
        return giocoRepository.findByGenere(genere);
    }

    public List<Gioco> getAll() {
        return giocoRepository.findAll();
    }

    public Gioco deleteGioco(Long id) {
        Gioco gioco = giocoRepository.findById(id).orElse(null);
        if (gioco != null) {
            giocoRepository.delete(gioco);
        }
        return gioco;
    }

}
