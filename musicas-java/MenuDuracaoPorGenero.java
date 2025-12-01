import model.Artista;
import model.Musica;

import java.util.Scanner;

public class MenuDuracaoPorGenero {
    public static void main(String[] args) {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Luan Santana", "Pop");
        Musica loveStory = new Musica("Love Story", taylorSwift, 120);
        Musica meteoro = new Musica("Meteoro", luanSantana, 100);
        Musica ICDWBH = new Musica ("I Can Do It With a Broken Heart", taylorSwift, 100);
        Scanner readingUser = new Scanner(System.in);
        System.out.println("Voce quer saber a duracao das musicas de que genero?");
        String generoUsuario = readingUser.nextLine();

        int duracao = Musica.duracaoTotalPorGenero(generoUsuario);

        System.out.println("a duracao de todas as musicas do genero " + generoUsuario + " é: " + duracao);
    }
}
