package menu.constant;

public enum MenuType {
    JAPANESE("일식"),
    KOREAN("한식"),
    CHINESE("중식"),
    ASIAN("아시안"),
    WESTERN("양식");

    private final String name;

    MenuType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
