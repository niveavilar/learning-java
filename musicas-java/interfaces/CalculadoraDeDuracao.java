package interfaces;

import model.Musica;

import java.util.List;

public interface CalculadoraDeDuracao {
    int calcular(List<Musica> musicas);
}