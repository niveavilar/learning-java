package cep.via;

public class FormatoInvalidoException extends RuntimeException {
    private String message;

    public FormatoInvalidoException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
