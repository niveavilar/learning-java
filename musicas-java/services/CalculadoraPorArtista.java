package services;

import interfaces.CalculadoraDeDuracao;
import model.Musica;

import java.util.List;

public class CalculadoraPorArtista implements CalculadoraDeDuracao {

    private String artista;

    public CalculadoraPorArtista(String artista) {
        this.artista = artista;
    }
    @Override
    public int calcular(List<Musica> musicas) {
        int totalDuracaoPorArtista = 0;
        for (Musica m : musicas) {
            if (m.getArtista().getNome().equalsIgnoreCase(artista)) {
                totalDuracaoPorArtista += m.getDuracaoSegundo();
            }
        }
        return totalDuracaoPorArtista;
    }
}