package menu.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static menu.constant.ErrorMessage.*;

public record Names(List<Name> names) {
    private static final String DELIMITER = ",";
    private static final int MIN_COUNT = 2;
    private static final int MAX_COUNT = 5;

    public Names {
        validateCount(names);
        validateNotDuplicate(names);
    }

    public static Names from(String names) {
        return new Names(Arrays.stream(names.split(DELIMITER))
                .map(String::trim)
                .map(Name::new)
                .toList());
    }

    private static void validateCount(List<Name> names) {
        if (names.size() < MIN_COUNT) {
            throw new IllegalArgumentException(COACH_COUNT_TOO_SHORT.toString());
        }
        if (names.size() > MAX_COUNT) {
            throw new IllegalArgumentException(COACH_COUNT_TOO_LONG.toString());
        }
    }

    private static void validateNotDuplicate(List<Name> names) {
        if (names.stream().map(Name::name).collect(Collectors.toSet()).size() != names.size()) {
            throw new IllegalArgumentException(NAME_DUPLICATED.toString());
        }
    }
}
