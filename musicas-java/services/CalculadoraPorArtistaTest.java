package services;

import interfaces.CalculadoraDeDuracao;
import model.Artista;
import model.Musica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraPorArtistaTest {

    @BeforeEach
    void limparDadosMusicas() {
        Musica.getMusicas().clear();
    }
    @Test
    void calculadoraPorArtistaTest() {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Musica meteoro = new Musica("Meteoro da Paixao", luanSantana, 120);
        Musica loveStory = new Musica("Love Story", taylorSwift, 250);
        Musica sinais = new Musica("Sinais", luanSantana, 140);

        List<Musica> todasAsMusicas = Musica.getMusicas();
        CalculadoraDeDuracao calcArtista = new CalculadoraPorArtista("Luan Santana");
        int duracaoArtista = calcArtista.calcular(todasAsMusicas);

        assertEquals(260, duracaoArtista);
    }

}