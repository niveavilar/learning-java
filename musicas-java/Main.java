import model.Artista;
import model.Musica;
import interfaces.CalculadoraDeDuracao;
import services.CalculadoraMusicas;
import services.CalculadoraPorArtista;
import services.CalculadoraPorGenero;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Musica meteoro = new Musica("Meteoro da Paixao", luanSantana, 120);
        Musica loveStory = new Musica("Love Story", taylorSwift, 250);

        System.out.println("Artista:" + luanSantana.getNome());
        System.out.println("Musica dele: " + meteoro.getTitulo());

        Musica.mostrarMusicas();

        List<Musica> todasAsMusicas = Musica.getMusicas();

        CalculadoraDeDuracao calcTodal = new CalculadoraMusicas();
        System.out.println("Duracao total das musicas: " + calcTodal.calcular(todasAsMusicas) + " segundos");
        CalculadoraDeDuracao calcArtista = new CalculadoraPorArtista("Taylor Swift");
        System.out.println("Total Taylor Swift: " + calcArtista.calcular(todasAsMusicas) + " segundos");
        CalculadoraDeDuracao calcGenero = new CalculadoraPorGenero("sertanejo");
        System.out.println("Total sertanejo: " + calcGenero.calcular(todasAsMusicas) + " segundos");
    }
}
