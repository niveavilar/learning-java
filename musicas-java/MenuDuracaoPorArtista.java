import java.util.Scanner;

import model.Artista;
import model.Musica;


public class MenuDuracaoPorArtista {

    public static void main(String[] args) {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Musica loveStory = new Musica("Love Story", taylorSwift, 120);
        Musica meteoro = new Musica("Meteoro", taylorSwift, 100);
        Musica ICDWBH = new Musica ("I Can Do It With a Broken Heart", taylorSwift, 100);
        Scanner readingUser = new Scanner(System.in);
        System.out.println("Voce quer saber a duracao das musicas de que artista?");
        String artistaDaMusica = readingUser.nextLine();

        int duracao = Musica.duracaoMusicasPorArtista(artistaDaMusica);

        System.out.println("A duracao de todas as musicas de " + artistaDaMusica + " é: " + duracao + " segundos.");

    }
}
