public class Musica {
    private String titulo;
    private String artista;
    private int duracaoSegundo;

        public Musica (String titulo, String artista, int duracaoSegundo) {
            this.titulo = titulo;
            this.artista = artista;
            this.duracaoSegundo = duracaoSegundo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo (String novoTitulo) {
            this.titulo = novoTitulo;
        }

        public String getArtista() {
            return artista;
        }

        public void setArtista(String novoArtista) {
            this.artista = novoArtista;
        }

        public int getDuracaoSegundo() {
            return duracaoSegundo;
        }

        public void setDuracaoSegundo(int novaDuracaoSegundo) {
            this.duracaoSegundo = novaDuracaoSegundo;
        }
}