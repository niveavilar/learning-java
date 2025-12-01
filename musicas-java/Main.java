import model.Artista;
import model.Musica;
public class Main {
    public static void main(String[] args) {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Musica meteoro = new Musica("Meteoro da Paixao", luanSantana, 120);
        Musica loveStory = new Musica("Love Story", taylorSwift, 250);

        System.out.println("Artista:" + luanSantana.getNome());
        System.out.println("Musica dele: " + meteoro.getTitulo());

        Musica.mostrarMusicas();

        System.out.println("Duracao total das musicas da lista: " + Musica.duracaoMusicas() + " segundos ");

    }
}
