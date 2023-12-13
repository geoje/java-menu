package menu.controller;

import menu.domain.*;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.List;
import java.util.function.Supplier;

public class AdviceController {
    public static void run() {
        notifyStart();
        Names names = requestNames();
        Coaches coaches = requestCoached(names);
        notifyResult(coaches);
    }

    private static void notifyStart() {
        OutputView.printStartTitle();
    }

    private static void notifyResult(Coaches coaches) {
        OutputView.printResultTitle();
        coaches.calculateLunches();
        OutputView.printCategoryMessage(coaches.getCategories().toArray());
        coaches.getCoaches().forEach(coach -> {
            OutputView.printAdviceMessage(coach.getName().name(), coach.getWeekdayLunches().toArray());
        });
        OutputView.printFinishTitle();
    }

    private static <T> T requestUntilValidated(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private static Names requestNames() {
        return requestUntilValidated(() -> Names.from(InputView.readNames()));
    }

    private static Menus requestUneatable(Name name) {
        return requestUntilValidated(() -> Menus.from(InputView.readUneatable(name.name())));
    }

    private static Coaches requestCoached(Names names) {
        List<Coach> coaches = names.names().stream()
                .map(name -> new Coach(name, requestUneatable(name)))
                .toList();
        return new Coaches(coaches);
    }
}
