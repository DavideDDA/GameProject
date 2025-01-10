package com.giochi.lista.giochi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giochi.lista.giochi.model.Gioco;
import com.giochi.lista.giochi.repository.GiocoRepository;

@Service
public class GiocoService {
    @Autowired
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

}
