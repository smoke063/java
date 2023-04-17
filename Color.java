public enum Color {
    RED("Красный"), BLUE("Синий"), GREEN("Зеленый");
    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
