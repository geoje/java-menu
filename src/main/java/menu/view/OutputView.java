package menu.view;

import menu.constant.GeneralMessage;

import static menu.constant.ErrorMessage.EXCEPTION_PREFIX;

public class OutputView {

    private static void printGeneralMessage(GeneralMessage message, Object... args) {
        System.out.printf(message + "%n", args);
    }

    public static void printAdviceMessage(String name, Object... menus) {
        System.out.printf(GeneralMessage.NOTIFY_NAME_AND_MENUS + "%n", menus);
    }

    public static void printErrorMessage(String message) {
        System.out.println(EXCEPTION_PREFIX + message);
    }
}
