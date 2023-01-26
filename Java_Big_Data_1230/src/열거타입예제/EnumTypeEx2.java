package 열거타입예제;

public class EnumTypeEx2 {
    public static void main(String[] args) {
        Developer dev = new Developer("이택현", DevType.EMBEDDED, Career.JUNIOR, Gender.MALE);
        dev.devInfo();
    }
}
