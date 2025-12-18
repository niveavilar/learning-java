package services;

import interfaces.CalculadoraDeDuracao;
import model.Musica;
import java.util.List;

public class CalculadoraMusicas implements CalculadoraDeDuracao {
    @Override
    public int calcular(List<Musica> musicas) {
        int totalDuracaoMusicas = 0;
        for (Musica m : musicas) {
            totalDuracaoMusicas += m.getDuracaoSegundo();
        }
        return totalDuracaoMusicas;
    }
}