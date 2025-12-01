package model;

import interfaces.CalculadoraDeDuracao;
import model.Musica;
public class Artista implements CalculadoraDeDuracao {
    private String nome;
    private String genero;

    public Artista(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String novoGenero) {

        this.genero = novoGenero;
    }
}