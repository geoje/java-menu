package menu.view;

import camp.nextstep.edu.missionutils.Console;
import menu.constant.GeneralMessage;

public class InputView {

    private static String readWithGeneralMessage(GeneralMessage message, Object... args) {
        System.out.printf(message.toString() + "%n", args);
        return Console.readLine().trim();
    }

    public static String readNames() {
        return readWithGeneralMessage(GeneralMessage.REQUEST_NAMES);
    }

    public static String readUneatable(String name) {
        return readWithGeneralMessage(GeneralMessage.REQUEST_UNEATABLE, name);
    }
}
