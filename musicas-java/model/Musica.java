package model;
import interfaces.CalculadoraDeDuracao;

import java.util.ArrayList;
import java.util.List;

public class Musica {
    private String titulo;
    private Artista artista;
    private int duracaoSegundo;
    private int totalDuracaoPorArtista = 0;

    private static List<Musica> musicas = new ArrayList<>();

        public Musica (String titulo, Artista artista, int duracaoSegundo) {
            this.titulo = titulo;
            this.artista = artista;
            this.duracaoSegundo = duracaoSegundo;
            musicas.add(this);
        }

        public String getTitulo() {

            return titulo;
        }


        public Artista getArtista() {

            return artista;
        }

        public int getDuracaoSegundo() {

            return duracaoSegundo;
        }

        public static List<Musica> getMusicas() {
            return musicas;
    }

        public static void mostrarMusicas() {
            System.out.println("*** LISTA DE MUSICAS! ***");
            for (Musica musica : musicas) {
                System.out.println("Titulo: " + musica.titulo + "; Artista: " + musica.getArtista().getNome() +
                        "; Duracao: " + musica.duracaoSegundo + " segundos");
            }
        }
}