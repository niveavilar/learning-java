package services;

import interfaces.CalculadoraDeDuracao;
import model.Artista;
import model.Musica;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraMusicasTest {

    @BeforeEach
    void setUp() {
        Musica.getMusicas().clear();
    }

    @Test
    void calculadoraMusicaTest() {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Musica meteoro = new Musica("Meteoro da Paixao", luanSantana, 120);
        Musica loveStory = new Musica("Love Story", taylorSwift, 250);
        Musica sinais = new Musica("Sinais", luanSantana, 140);
        List<Musica> todasAsMusicas = Musica.getMusicas();

        CalculadoraDeDuracao calcTodal = new CalculadoraMusicas();
        int duracao = calcTodal.calcular(todasAsMusicas);

        assertEquals(510, duracao);

    }
}