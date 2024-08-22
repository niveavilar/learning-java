package cep.via;

import java.io.IOException;
import java.util.Scanner;

public class MenuUsuario {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner readingUser = new Scanner(System.in);
        System.out.println("Oi! Digite o cep (8 digitos, apenas numeros), e eu te direi o endereco!");
        String cep = readingUser.nextLine();
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        FindingCep findingCep = new FindingCep();
        GeradorDeArquivo geradorDeArquivo = new GeradorDeArquivo();

        try {
            Address address = findingCep.achandoEndereco(cep);
            System.out.println("Endereço: \n Rua - " + address.logradouro() +
                    "\n Bairro - " + address.bairro() +
                    "\n CEP - " + address.cep() +
                    "\n Cidade - " + address.localidade() +
                    "\n Estado - " + address.uf());

            geradorDeArquivo.criandoArquivo(address);
            System.out.println("O endereço foi salvo no arquivo endereco.json.");

        } catch (FormatoInvalidoException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
