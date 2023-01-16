package 다형성응용2;

public class Vehicle {
    public void run(){
        System.out.print("자동차가 달립니다.");
    }
}
class SportCar extends Vehicle{
    @Override
    public void run(){
        System.out.print("스포츠카가 달립니다.");
    }
}

class Bus extends Vehicle {
    @Override
    public void run() {
        System.out.print("버스가 달립니다.");
    }
}

class Taxi extends Vehicle {
    @Override
    public void run() {
        System.out.print("택시가 달립니다.");
    }
}