package 인터페이스리모컨;
// 인터페이스란?
// 모든 필드는 자동으로 상수(final static)으로 변환됩니다.
// 모든 메소드는 자동으로 추상메소드가 됩니다. (public abstract 가 자동 추가 됨)
// 디폴트 메소드 : 예외적으로 구현부를 가질수 있으며 상속받은 클래스에서 재정의 가능합니다.
// 정적메소드를 포함 할 수 있습니다. (정적메소드는 객체화 상관 없고 인터페이스 타입으로 사용됩니다)
public interface RemoteControl {
    int MAX_VOLUME = 100; // 상수로 정의 하지 않았지만 정적인 상수이다. (인터페이스 생성 시 만들어지고 객체는 안됨_
    int MIN_VOLUME = 0; // 자동으로 final static 이 붙음
    void turnOn(); // 자동으로 public abstract가 붙음 ( 왜냐면 인터페이스는 기본적으로 모든 메소드가 추상 메소드이다)
    void turnOff();
    void setVolume(int volume);
    static void changeBattery(){ //인터페이스 이름으로 접근해야되고 상속과는 무관
        System.out.println("건전지를 교환합니다.");
    }
    void getInfo();

    // 자바 버전 1.8부터 추가, 예외적으로 메소드의 구현부를 가질수 있음.
    default void setMute(boolean mute){
        if(mute) System.out.println("무음 처리합니다.");
        else System.out.println("무음을 해제합니다. ");
    }
}