package services;
import model.Musica;

import java.util.ArrayList;
import java.util.List;

public class FiltroPorGenero extends FiltroDeMusicas {
    private String genero;

    public FiltroPorGenero(String genero) {
        this.genero = genero;
    }

    protected List<Musica> filtrar(List<Musica> musicas) {
        List<Musica> filtradaGenero = new ArrayList<>();
        for (Musica m : musicas) {
            if (m.getArtista().getGenero().equalsIgnoreCase(genero)) {
                filtradaGenero.add(m);
            }
        }
        return filtradaGenero;
    }
}