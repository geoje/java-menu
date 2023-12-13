package menu.constant;

public enum GeneralMessage {
    NOTIFY_START("점심 메뉴 추천을 시작합니다."),
    NOTIFY_RESULT("메뉴 추천 결과입니다."),
    NOTIFY_DAY_OF_WEEK("[ 구분 | 월요일 | 화요일 | 수요일 | 목요일 | 금요일 ]"),
    NOTIFY_CATEGORY("[ 카테고리 | 한식 | 한식 | 일식 | 중식 | 아시안 ]"),
    NOTIFY_NAME_AND_MENUS("[ %s | %s | %s | %s | %s | %s ]"),
    NOTIFY_FINISH("추천을 완료했습니다."),

    REQUEST_NAMES("코치의 이름을 입력해 주세요. (, 로 구분)"),
    REQUEST_UNEATABLE("%s(이)가 못 먹는 메뉴를 입력해 주세요.");

    private final String message;

    GeneralMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
