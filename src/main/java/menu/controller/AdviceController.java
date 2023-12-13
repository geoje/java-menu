package menu.controller;

import menu.constant.GeneralMessage;
import menu.domain.Names;
import menu.view.InputView;
import menu.view.OutputView;

public class AdviceController {
    public static void run() {
        notifyStart();
        Names names = requestNames();
    }

    private static void notifyStart() {
        OutputView.printGeneralMessage(GeneralMessage.NOTIFY_START);
    }

    private static Names requestNames() {
        return Names.from(InputView.readNames());
    }
}
