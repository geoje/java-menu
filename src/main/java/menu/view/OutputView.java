package menu.view;

import menu.constant.GeneralMessage;

import static menu.constant.ErrorMessage.EXCEPTION_PREFIX;
import static menu.constant.GeneralMessage.*;

public class OutputView {

    public static void printGeneralMessage(GeneralMessage message, Object... args) {
        System.out.printf(message + "%n", args);
    }

    public static void printCategoryMessage(Object... categories) {
        System.out.printf(NOTIFY_CATEGORY + "%n", categories);
    }

    public static void printAdviceMessage(Object... nameAndMenus) {
        System.out.printf(NOTIFY_NAME_AND_MENUS + "%n", nameAndMenus);
    }

    public static void printErrorMessage(String message) {
        System.out.println(EXCEPTION_PREFIX + message);
    }

    public static void printStartTitle() {
        System.out.printf(NOTIFY_START + "%n%n");
    }

    public static void printResultTitle() {
        System.out.println(NOTIFY_RESULT);
        System.out.println(NOTIFY_DAY_OF_WEEK);
    }

    public static void printFinishTitle() {
        System.out.printf("%n" + NOTIFY_FINISH + "%n");
    }
}
