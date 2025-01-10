package com.giochi.lista.giochi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giochi.lista.giochi.model.Gioco;

public interface GiocoRepository extends JpaRepository<Gioco, Long> {
    List<Gioco> findByTitoloContaining(String titolo);

    List<Gioco> findByGenere(String genere);
}
