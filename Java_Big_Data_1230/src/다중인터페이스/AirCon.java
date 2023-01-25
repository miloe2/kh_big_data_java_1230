package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 을 자동으로 추가 함 (컴파일러)
    int MIN_TEMP = 0;
    void airConON(); // 자동으로 추상메소드가 됨(abstract 자동 추가)
    void airConOFF();
    void setAirConTemp(int tmp);
}
