package 자동차만들기;

public class Car {
    protected int fuelEff ;
    protected int speed;
    protected int oilSize;
    protected int seat;
    protected String name;
    protected boolean isOption;

    Car(String name){
        this.name = name;
    }
}
class SportCar extends Car {
    SportCar(String name) {
        super(name);
        speed = 250;
        fuelEff = 8;
        oilSize = 30;
        seat = 2;
        isOption = false;
    }

    void infoSportCar() {
        String onOffStr = (isOption) ? "ON" : "OFF";
        System.out.println("====== " + name + " ======");
        System.out.println("속도 : " + speed);
        System.out.println("연비 : " + fuelEff);
        System.out.println("연료탱크 : " + oilSize);
        System.out.println("좌석수 : " + seat);
        System.out.println("터보기능 : " + onOffStr);
    }

    int getSpeed() { // Getter.
        if (isOption) return speed *= 1.2;
        return speed;
    }
    boolean getTurbo(){
        return isOption;
    }

    int setTurbo(boolean turbo){ // Setter 외부에서 내부에 있는 필드값을 변경
        if(turbo) return speed *= 1.2 ;
        return 0;
    }

}
class Vehicle extends Car {
    Vehicle(String name) {
        super(name);
        speed = 200;
        fuelEff = 12;
        oilSize = 45;
        seat = 4;
    }
    void infoVehicle(){
        String onOffStr = (isOption) ? "ON" : "OFF";
        System.out.println("====== "+ name + " ======");
        System.out.println("속도 : " + speed);
        System.out.println("연비 : " + fuelEff);
        System.out.println("연료탱크 : " + oilSize  );
        System.out.println("좌석수 : " + seat);
        System.out.println("트렁크 : " + onOffStr);
    }

    int setTrunk(boolean trunk){
        if(trunk) return seat +=1 ;
        return 0;
    }
}

class Bus extends Car {

    Bus(String name) {
        super(name);
        speed = 150;
        fuelEff = 5;
        oilSize = 100;
        seat = 20;
    }

    void infoBus() {
        String onOffStr = (isOption) ? "ON" : "OFF";
        System.out.println("====== " + name + " ======");
        System.out.println("속도 : " + speed);
        System.out.println("연비 : " + fuelEff);
        System.out.println("연료탱크 : " + oilSize);
        System.out.println("좌석수 : " + seat);
        System.out.println("보조연료탱크 : " + onOffStr);
    }

    int setTank(boolean tank){ // Setter 외부에서 내부에 있는 필드값을 변경
        if(tank) return oilSize += 30 ;
        return 0;
    }
}