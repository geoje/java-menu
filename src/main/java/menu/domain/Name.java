package menu.domain;

import static menu.constant.ErrorMessage.INVALID_NAME_LENGTH;

public record Name(String name) {
    private static final int MIN_LENGTH = 2;
    private static final int MAX_LENGTH = 4;

    public Name {
        validateLength(name);
    }

    private static void validateLength(String name) {
        if (name.length() < MIN_LENGTH || name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException(INVALID_NAME_LENGTH.toString());
        }
    }
}
