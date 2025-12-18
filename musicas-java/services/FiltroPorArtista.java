package services;

import model.Musica;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorArtista extends FiltroDeMusicas {
    private String artista;

    public FiltroPorArtista(String artista) {
        this.artista = artista;
    }

    protected List<Musica> filtrar(List<Musica> musicas) {
        List<Musica> filtradaArtista = new ArrayList<>();

        for (Musica m : musicas) {
            if (m.getArtista().getNome().equalsIgnoreCase(artista)) {
                filtradaArtista.add(m);
            }
        }
        return filtradaArtista;
    }
}