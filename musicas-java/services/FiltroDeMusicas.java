package services;

import model.Musica;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroDeMusicas {

        protected abstract List<Musica> filtrar(List<Musica> musicas);

        public List<Musica> aplicar(List<Musica> musicas) {
            return filtrar(musicas);
        }

}
