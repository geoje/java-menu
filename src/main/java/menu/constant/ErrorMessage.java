package menu.constant;

public enum ErrorMessage {
    EXCEPTION_PREFIX("[ERROR] "),

    INVALID_NAME_LENGTH("코치 이름은 2글자 이상 4글자 이하이여야 합니다."),
    COACH_COUNT_TOO_SHORT("코치는 최소 2명 이상 입력해야 합니다."),
    COACH_COUNT_TOO_LONG("코치는 최대 5명 이하 입력해야 합니다."),
    NAME_DUPLICATED("코치 이름이 중복 입력 되었습니다."),

    MENU_DUPLICATED("메뉴가 중복 입력 되었습니다."),

    MENU_NOT_EXIST("존재 하지 않는 메뉴가 입력 되었습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
