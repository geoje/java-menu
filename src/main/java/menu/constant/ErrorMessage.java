package menu.constant;

public enum ErrorMessage {
    EXCEPTION_PREFIX("[ERROR] ");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
