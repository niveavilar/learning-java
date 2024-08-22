package cep.via;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FindingCep {

    public Address achandoEndereco (String cep) {
        String endereco = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 400) {
                throw new FormatoInvalidoException("Formato de cep invalido. Por favor insira apenas numeros, " +
                        "8 digitos, sem espacos ou hifens");
            }
            String json = response.body();
            Gson gson = new Gson();
            Address address = gson.fromJson(json, Address.class);

            if (address.erro() != null) {
                throw new FormatoInvalidoException("CEP não encontrado. Por favor, verifique o CEP e tente novamente.");
            }

            return address;
        }

        catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao buscar o CEP: " + e.getMessage());
        }
    }
}
