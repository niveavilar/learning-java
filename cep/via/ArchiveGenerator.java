package cep.via;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class ArchiveGenerator {
    public void creatingArchive (Address address) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter writing = new FileWriter(address.cep() + ".json");
        writing.write(gson.toJson(address));
        writing.close();
    }
}
