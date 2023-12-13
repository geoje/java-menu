package menu.domain;

import camp.nextstep.edu.missionutils.Randoms;
import menu.constant.Menu;
import menu.constant.MenuType;

import java.time.DayOfWeek;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.time.DayOfWeek.*;

public class Coaches {
    private static final List<DayOfWeek> WEEKDAYS = List.of(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY);
    private final List<Coach> coaches;
    private final MenuType[] categories;

    public Coaches(List<Coach> coaches) {
        this.coaches = coaches;
        categories = new MenuType[DayOfWeek.values().length + 1];
    }

    public void calculateLunches() {
        WEEKDAYS.forEach(dayOfWeek -> {
            MenuType type = MenuType.values()[Randoms.pickNumberInRange(1, 5) - 1];
            categories[dayOfWeek.getValue()] = type;

            coaches.forEach(coach -> {
                List<Menu> exclude = Stream.of(coach.getUneatable().menus(), coach.getWeekdayLunches())
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());
                List<String> choice = Menu.getAllByTypeWithoutSome(type, exclude).stream()
                        .map(Menu::getName)
                        .toList();
                coach.setLunches(dayOfWeek, Menu.getByName(Randoms.shuffle(choice).get(0)).get());
            });
        });
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public List<MenuType> getCategories() {
        return WEEKDAYS.stream().map(dayOfWeek -> categories[dayOfWeek.getValue()]).toList();
    }
}
