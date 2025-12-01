package model;
import interfaces.CalculadoraDeDuracao;

import java.util.ArrayList;
import java.util.List;

public class Musica implements CalculadoraDeDuracao {
    private String titulo;
    private Artista artista;
    private int duracaoSegundo;
    private int totalDuracaoPorArtista = 0;

    public static List<Musica> musicas = new ArrayList<>();

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

        public void addMusica(Musica musica) {

            musicas.add(musica);
        }

        public int getDuracaoSegundo() {

            return duracaoSegundo;
        }

        public static void mostrarMusicas() {
            System.out.println("*** LISTA DE MUSICAS! ***");
            for (Musica musica : musicas) {
                System.out.println("Titulo: " + musica.titulo + "; Artista: " + musica.getArtista().getNome() +
                        "; Duracao: " + musica.duracaoSegundo + " segundos");
            }
        }

        public static int duracaoMusicas() {
            int totalDuracaoMusicas = 0;
            for (Musica m : musicas) {
                totalDuracaoMusicas += m.getDuracaoSegundo();
            }
            return totalDuracaoMusicas;
        }

        public static int duracaoMusicasPorArtista(String artistaDaMusica) {
            int totalDuracaoPorArtista = 0;
            for (Musica m : musicas) {
                if (m.getArtista().getNome().equalsIgnoreCase(artistaDaMusica)) {
                    totalDuracaoPorArtista += m.getDuracaoSegundo();
                }
            }
            return totalDuracaoPorArtista;
        }

    public static int duracaoTotalPorGenero(String genero) {
        int total = 0;
        for (Musica m : musicas) {
            if (m.getArtista().getGenero().equalsIgnoreCase(genero)) {
                total += m.getDuracaoSegundo();
            }
        }
        return total;
    }
}