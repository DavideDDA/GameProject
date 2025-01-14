package com.giochi.lista.giochi.exceptions;

public class GiocoNotFound extends RuntimeException {
    public GiocoNotFound(String message) {
        super(message);
    }

    public GiocoNotFound(Integer id) {
        super("Gioco con id " + id + " non trovato");
    }
}
