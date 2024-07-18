package cardoso.nivea;
// nome, idade e um ToString
public class Pessoa {
    private String name;
    private int idade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String ToString() {
        return "Pessoa: " + this.name + ", idade: " + this.idade + ".";
    }
}
