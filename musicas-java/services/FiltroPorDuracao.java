package services;

import model.Musica;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorDuracao extends FiltroDeMusicas {
    private int duracaoSegundo;

    public FiltroPorDuracao(int duracaoSegundo) {
        this.duracaoSegundo = duracaoSegundo;
    }

    protected List<Musica> filtrar(List<Musica> musicas) {
        List<Musica> filtradaDuracao = new ArrayList<>();

        for (Musica m : musicas) {
            if (m.getDuracaoSegundo() <= duracaoSegundo) {
                filtradaDuracao.add(m);
            }
        }
        return filtradaDuracao;
    }
}