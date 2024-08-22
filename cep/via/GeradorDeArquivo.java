package cep.via;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void criandoArquivo (Address endereco) throws IOException {
        FileWriter escrita = new FileWriter("endereco.json");
        escrita.write(endereco.cep());
        escrita.close();
    }
}
