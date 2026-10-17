package services;

import model.Artista;
import model.Musica;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FiltroPorDuracaoTest {
    @Test
    void FiltroPorDuracaoTest() {
        Artista luanSantana = new Artista("Luan Santana", "Sertanejo");
        Artista taylorSwift = new Artista("Taylor Swift", "Pop");
        Artista gustavoMioto = new Artista("Gustavo Mioto", "sertanejo");
        Musica meteoro = new Musica("Meteoro da Paixao", luanSantana, 120);
        Musica loveStory = new Musica("Love Story", taylorSwift, 250);
        Musica sinais = new Musica("Sinais", luanSantana, 140);
        Musica solteiro = new Musica ("Solteiro nao trai", gustavoMioto, 120);

        List<Musica> todasAsMusicas = Musica.getMusicas();
        FiltroDeMusicas filtroDuracao = new FiltroPorDuracao(130);

        List<Musica> resultado = filtroDuracao.aplicar(todasAsMusicas);

        assertEquals(2, resultado.size());
        assertTrue(resultado.stream()
                .allMatch(m -> m.getDuracaoSegundo() <= 130));
    }
}