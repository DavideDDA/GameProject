package com.giochi.lista.giochi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.giochi.lista.giochi.model.Gioco;

//Viene esteso con JPARepository per poter usare le funzioni di JPA come save, findAll, findById, delete, etc.
public interface GiocoRepository extends JpaRepository<Gioco, Integer> {
    List<Gioco> findByTitoloContaining(String titolo);

    List<Gioco> findByGenere(String genere);
}
