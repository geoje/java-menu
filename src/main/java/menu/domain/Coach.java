package menu.domain;

import menu.constant.Menu;

import java.time.DayOfWeek;
import java.util.List;

import static java.time.DayOfWeek.*;

public class Coach {
    private static final List<DayOfWeek> WEEKDAYS = List.of(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY);
    private final Name name;
    private final Menus uneatable;
    private final Menu[] lunches;

    public Coach(Name name, Menus uneatable) {
        this.name = name;
        this.uneatable = uneatable;
        lunches = new Menu[DayOfWeek.values().length];
    }

    public Name getName() {
        return name;
    }

    public Menus getUneatable() {
        return uneatable;
    }

    public List<Menu> getWeekdayLunches() {
        return WEEKDAYS.stream().map(dayOfWeek -> lunches[dayOfWeek.getValue()]).toList();
    }

    public void setLunches(DayOfWeek dayOfWeek, Menu lunch) {
        lunches[dayOfWeek.getValue()] = lunch;
    }
}
