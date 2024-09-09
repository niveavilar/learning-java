package cep.via;

public class InvalidFormatException extends RuntimeException {
    private String message;

    public InvalidFormatException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
