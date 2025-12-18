package services;

import model.Musica;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroDeMusicas {
    // uma classe abstrata é uma classe que nao pode ser instanciada, e serve como modelo/base
    // para outras classes. ex: posso criar uma classe abstrata de um animal, q n pode ser instanciada
    // mas tera caracteristicas q serao compartilhadas entre outras classes filhas, como a classe
    // Gato e Cachorro.

    // se o genero da musica for igual ao que eu to digitando, entao entra pra lista filtrada?
        protected abstract List<Musica> filtrar(List<Musica> musicas);

        public List<Musica> aplicar(List<Musica> musicas) {
            return filtrar(musicas);
        }

}