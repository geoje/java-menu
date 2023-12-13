package menu.domain;

import menu.constant.Menu;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static menu.constant.ErrorMessage.MENU_DUPLICATED;
import static menu.constant.ErrorMessage.MENU_NOT_EXIST;

public record Menus(List<Menu> menus) {
    private static final String DELIMITER = ",";

    public Menus {
        validateNotDuplicated(menus);
    }

    public static Menus from(String menus) {
        if (menus.isBlank()) {
            return new Menus(List.of());
        }
        List<Optional<Menu>> parsedMenus = Arrays.stream(menus.split(DELIMITER))
                .map(String::trim)
                .map(Menu::getByName)
                .toList();
        validateExist(parsedMenus);
        return new Menus(parsedMenus.stream().map(Optional::get).toList());
    }

    private static void validateNotDuplicated(List<Menu> menus) {
        if (menus.stream().map(Menu::getName).collect(Collectors.toSet()).size() != menus.size()) {
            throw new IllegalArgumentException(MENU_DUPLICATED.toString());
        }
    }

    private static void validateExist(List<Optional<Menu>> parsedMenus) {
        if (parsedMenus.stream().anyMatch(Optional::isEmpty)) {
            throw new IllegalArgumentException(MENU_NOT_EXIST.toString());
        }
    }
}
