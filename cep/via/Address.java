package cep.via;

public record Address(String cep, String logradouro, String bairro, String localidade, String uf, String erro) {
    public Address(String cep, String logradouro, String bairro, String localidade, String uf) {
        this(cep, logradouro, bairro, localidade, uf, null);
    }
}
