package com.giochi.lista.giochi.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.giochi.lista.giochi.DTO.GiochiDTO;
import com.giochi.lista.giochi.model.Gioco;
import com.giochi.lista.giochi.repository.GiocoRepository;

@Service // Annotazione per dichiarare la classe come servizio
public class GiocoService {
    @Autowired // Annotazione per l'injecting delle dipendenze della classe repository, in modo
               // tale da utilizzare le funzioni di JPA
    private GiocoRepository giocoRepository;

    public List<GiochiDTO> getAllGiochi() {
        return giocoRepository.findAll().stream().map(this::convertToDto).collect(Collectors.toList());
    }

    public GiochiDTO convertToDto(Gioco gioco) {
        return new GiochiDTO(gioco.getTitolo(), gioco.getGenere());
    }

    public Gioco saveGioco(Gioco gioco) {
        return giocoRepository.save(gioco);
    }

    public List<Gioco> searchByTitle(String titolo) {
        return giocoRepository.findByTitoloContaining(titolo);
    }

    public List<Gioco> searchByGenre(String genere) {
        return giocoRepository.findByGenere(genere);
    }

    public void deleteGioco(Integer id) {
        giocoRepository.deleteById(id);
    }
}
