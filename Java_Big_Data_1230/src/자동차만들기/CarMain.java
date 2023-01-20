//package 자동차만들기;
//
//import java.util.Scanner;
//
//
//public class CarMain {
//    public static void main(String[] args) {
//
//        SportCar sportCar = new SportCar("스포츠카");
//        sportCar.setTurbo(true);
//        sportCar.getTurbo();
//        sportCar.getSpeed();
//        sportCar.infoSportCar();
//
//        Vehicle vehicle = new Vehicle("승용차");
//        vehicle.setTrunk(true);
////        vehicle.getTrunk();
////        vehicle.getSeat();
//        vehicle.infoVehicle();
//
//        Bus bus = new Bus("버스");
//        bus.setTank(true);
////        bus.getTank();
////        bus.getOilSize();
//        bus.infoBus();
//
//        int dt;
//        String  selLoc;
//        int manNum;
//        int speedSet;
//        String addFun;
//        int oilPrice = 0;
//        int charge = 0;
//        int oilCnt = 0;
//        double driveTime = 0;
//        Car car = null;
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("이동 지역을 선택 하세요 [1] 부산 [2] 대전 [3] 강릉 [4] 광주 : ");
//        selLoc = sc.next();
//        switch (selLoc) {
//            case "부산" : dt = 400; break;
//            case "대전" : dt = 200; break;
//            case "강릉" : dt = 150; break;
//            case "광주" : dt = 300; break;
//        }
//
//        System.out.println("이동하는 인원 수를 입력 하세요 (1~100명 이내) : ");
//        manNum = sc.nextInt();
//
//        System.out.println("이동 차량을 선택 하세요 [1] 스포츠카 [2] 승용차 [3] 버스 : ");
//        int selCar = sc.nextInt();
//        switch (selCar) {
//            case 1 : speedSet = 250; break;
//            case 2 : speedSet = 200; break;
//            case 3 : speedSet = 150; break;
//        }
//
//        while (true) {
//            System.out.println("부가기능을 사용하시겠습니까? [ON]/[OFF] : ");
//            addFun = sc.next();
//            if (addFun.equalsIgnoreCase("ON")) {
//                isOption = true;
//                break;
//            } else if (addFun.equalsIgnoreCase("OFF")) {
//                car.isOption = false;
//                break;
//            } else System.out.println("잘 못 입력하셨습니다.");
//        }
//        selCar
//        }
//    }
//}