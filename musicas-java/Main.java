import model.Artista;
import model.Musica;
import interfaces.CalculadoraDeDuracao;
import services.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Musica meteoro = new Musica("Meteoro da Paixao", luanSantana, 120);
        Musica loveStory = new Musica("Love Story", taylorSwift, 250);
        Musica sinais = new Musica("Sinais", luanSantana, 140);

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

        FiltroDeMusicas filtroArtista = new FiltroPorArtista("Luan Santana");

        List<Musica> musicasLuan = filtroArtista.aplicar(todasAsMusicas);

        System.out.println("Musicas de Luan: ");

        for (Musica m : musicasLuan) {
            System.out.println(m.getTitulo());
        }

        System.out.println("fim\n");

        todasAsMusicas.stream()
                .map(Musica::getTitulo)
                .forEach(System.out::println);

        System.out.println("fim\n");

        Map<String, Long> quantidadePorGenero =
                todasAsMusicas.stream()
                        .collect(Collectors.groupingBy(
                                m -> m.getArtista().getGenero(),
                                Collectors.counting()
                        ));

        quantidadePorGenero.forEach((genero, quantidade) ->
                System.out.println(genero + ": " + quantidade + " músicas")
        );




    }
}
