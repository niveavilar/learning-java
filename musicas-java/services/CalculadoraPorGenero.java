package services;

import interfaces.CalculadoraDeDuracao;
import model.Musica;

import java.util.List;

public class CalculadoraPorGenero implements CalculadoraDeDuracao {

    private String genero;
    public CalculadoraPorGenero(String genero) {
        this.genero = genero;
    }
    public int calcular(List<Musica> musicas) {
        int total = 0;
        for (Musica m : musicas) {
            if (m.getArtista().getGenero().equalsIgnoreCase(genero)) {
                total += m.getDuracaoSegundo();
            }
        }
        return total;
    }
}