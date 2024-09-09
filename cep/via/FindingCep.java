package cep.via;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FindingCep {

    public Address FindingAddress (String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            if (response.statusCode() == 400) {
                throw new InvalidFormatException("Invalid cep format. Please type only numbers, " +
                        "8 digits, no spaces or hifens");
            }
            String json = response.body();
            Gson gson = new Gson();
            Address address = gson.fromJson(json, Address.class);

            if (address.erro() != null) {
                throw new InvalidFormatException("CEP not found. Please, verify the CEP and try again.");
            }

            return address;
        }

        catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error while searching for CEP: " + e.getMessage());
        }
    }
}
