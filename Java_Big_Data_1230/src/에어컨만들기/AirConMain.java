package 에어컨만들기;

import 상속실습예제.Person;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class AirConMain {
    public static void main(String[] args) throws InterruptedException {
        AirCon lgAircon = new AirCon();
        Scanner sc = new Scanner(System.in); // 에어컨을 켜기 위해 콘솔 입력을 받음.
        int elapsedTime = 0; //경과시간을 계산하기 위한 변수
        boolean isSetTemp = false; // 온도가 변경되어야 할 조건 확인
        System.out.println("에어컨을 켜시겠습니다(yes/no) : ");
        String isON = sc.next(); // 에어컨을 켜기 위한 문자열 입력 받음
        if (isON.equalsIgnoreCase("yes")) {
            lgAircon.setPower(true);
            lgAircon.setAirConState();
            while (true) {
                sleep(1000); // 1초
                elapsedTime++;
                switch (lgAircon.getWindStep()) {
                    case 1:
                        if (elapsedTime >= 20) isSetTemp = true;
                        break;
                    case 2:
                        if (elapsedTime >= 10) isSetTemp = true;
                        break;
                    case 3:
                        if (elapsedTime >= 5) isSetTemp = true;
                        break;
                    default:
                }
                if (isSetTemp) {
                    if (lgAircon.isHeater()) lgAircon.setCurrTemp(1);
                    if (lgAircon.isCooler()) lgAircon.setCurrTemp(-1);
                    lgAircon.ariConInfo();
                    isSetTemp = false;
                    elapsedTime = 0;
                }
                if (lgAircon.getCurrTemp() == lgAircon.getSetTemp()) {
                    System.out.println("에어컨을 종료 합니다.^^");
                    break;

                }
            }


        }
    }
}
