package 변수와데이터;
public class DataType {
    public static void main(String[] args) {
     /*

        int taxRate = 100; // 정수값을 저장할 수 있는 age라는 변수를 선언하고 초기값으로 100을 대입
        double value = 0.0; // 실수값을 저장할 수 있는 value라는 변수를 선언하고 초기값을 0.0으로 대입

            System.out.println(taxRate);


        int num1, num2; // 같은 타입을 여러개의 변수를 선언. 콤마(,)로 구분
        double num3 = 3.14; // 실수 타입의 변수를 선언과 동시에 초기화
        int hour = 3;
        int minute = 5;

        System.out.println(hour + "시" + minute + "분 입니다.");
    */

        NameCard NameCard = new NameCard();
        NameCard.name = "곰돌이사육사";
        NameCard.age = 30;
        NameCard.address = "경기도 수원시";
        NameCard.eMail = "miloers@naver.com";
        NameCard.phoneNumber = "010-9155-3194";

        System.out.println(NameCard.name);

    }
}

// 사용자 정의 자료형
class NameCard{
    String name;
    int age;
    String address;
    String eMail;
    String phoneNumber;
}
