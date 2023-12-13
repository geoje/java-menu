package menu.controller;

import menu.constant.GeneralMessage;
import menu.domain.Names;
import menu.view.InputView;
import menu.view.OutputView;

import java.util.function.Supplier;

public class AdviceController {
    public static void run() {
        notifyStart();
        Names names = requestNames();
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
        OutputView.printGeneralMessage(GeneralMessage.NOTIFY_START);
    }

    private static Names requestNames() {
        return requestUntilValidated(() -> Names.from(InputView.readNames()));
    }
}
