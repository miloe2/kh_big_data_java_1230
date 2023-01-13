package 오버라이딩제약;
// 오버라이딩은 부모가 가진 메소드를 재정의해서 사용하는 것
// 부모의 클래스가 실체가 있는 클래스이면, 오버라이딩은 선택사항
// 부모의 클래스에서 메소드 구현 시 상속 받은 자식에게 오버라이딩을 할 수 없도록 금지 할수 있음.
public class FinalOverriding {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar("Ferrari");
        sportCar.setTurbo(true);
        sportCar.getTurbo();
        sportCar.infoCar();
        sportCar.accelerator();
        sportCar.breakPanel();

        ElectronicCar electronicCar = new ElectronicCar("EV6");
        electronicCar.setAutoDrv(true);
        electronicCar.infoCar();

    }

}