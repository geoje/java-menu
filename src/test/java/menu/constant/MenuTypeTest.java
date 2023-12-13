package menu.constant;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MenuTypeTest {
    @Test
    @DisplayName("Enum이 순서대로 출력 되는지")
    void linear() {
        Arrays.stream(MenuType.values()).forEach(System.out::println);
    }
}
