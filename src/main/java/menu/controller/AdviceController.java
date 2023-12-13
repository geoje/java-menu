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

    private static <T> T requestUntilValidated(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException e) {
                OutputView.printErrorMessage(e.getMessage());
            }
        }
    }

    private static void notifyStart() {
        OutputView.printStartTitle();
    }

    private static void notifyResult(Coaches coaches) {
        OutputView.printResultTitle();
        OutputView.printCategoryMessage("한식", "양식", "일식", "중식", "아시안");
        OutputView.printAdviceMessage("구구", "김치찌개", "스파게티", "규동", "짜장면", "카오 팟");
        OutputView.printAdviceMessage("제임스", "제육볶음", "라자냐", "가츠동", "짬뽕", "파인애플 볶음밥");
        OutputView.printFinishTitle();
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
