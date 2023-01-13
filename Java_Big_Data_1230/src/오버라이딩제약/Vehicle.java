package 오버라이딩제약;

public class Vehicle {
    protected int speed; //protected 상속관계와 동일 패키지
    protected String color;
    protected String name;
    // final 은 최종상태를 의미하며, 메소드에서 사용 시 오버로딩이 불가함을 의미합니다.
    final void accelerator(){
        System.out.println("차의 속도를 증가시킵니다.");
    }
    final void breakPanel(){
        System.out.println("차의 속도를 감소시킵니다.");
    }
}
class SportCar extends Vehicle{
    private boolean isTurbo; // 터보모드가 켜지면 차의 최고 속도를 증가시키는 기능
    SportCar(String name){
        isTurbo = false;
        speed = 280; // Vehicle로 상속 받음
        this.name = name; // 생성자로부터 이름을 입력 받아 인스턴스 필드의 초기값으로 사용
        color = "Red";
    }
    int getSpeed(){ // Getter.
        if(isTurbo) return speed *= 1.2;
        return speed;
    }
    boolean getTurbo(){ // Getter.
        return isTurbo;
    }
    void setTurbo(boolean turbo){ // Setter 외부에서 내부에 있는 필드값을 변경
        isTurbo = turbo;
    }
    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + getSpeed());
        System.out.println("색상 : " + color  );
        System.out.println("터보모드 : " +isTurbo);
    }
}
class ElectronicCar extends Vehicle{
    boolean isAutoDrv;
    ElectronicCar(String name){
        isAutoDrv = false;
        speed = 200;
        this.name = name;
        color = "White";
    }
    boolean getAutoDrv(){
        return isAutoDrv;
    }
    void setAutoDrv(boolean autoDrv){
        isAutoDrv = autoDrv;
    }
    void infoCar(){
        System.out.println("이름 : " + name);
        System.out.println("속도 : " + speed);
        System.out.println("색상 : " + color);
        System.out.println("자율주행 : "+ isAutoDrv);
    }
}