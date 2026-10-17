package services;

import interfaces.CalculadoraDeDuracao;
import model.Artista;
import model.Musica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraPorGeneroTest {
    @BeforeEach
    void limparDados() {
        Musica.getMusicas().clear();
    }
    @Test
    void calculadoraPorGeneroTest() {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Artista gustavoMioto = new Artista("Gustavo Mioto", "sertanejo");
        Musica meteoro = new Musica("Meteoro da Paixao", luanSantana, 120);
        Musica loveStory = new Musica("Love Story", taylorSwift, 250);
        Musica sinais = new Musica("Sinais", luanSantana, 140);
        Musica solteiro = new Musica ("Solteiro nao trai", gustavoMioto, 120);

        List<Musica> todasAsMusicas = Musica.getMusicas();

        CalculadoraDeDuracao calcGenero = new CalculadoraPorGenero("sertanejo");

        int duracaoGenero = calcGenero.calcular(todasAsMusicas);

        assertEquals(380, duracaoGenero);

    }

}