package 타입변환;
// 타입 변환이란 ? 하나의 타입을 다른 타입으로 변경하는 것
// 묵시적 형변환(Auto) : 컴파일러가 유리한 방향으로 형을 변경해주는 것.
// 명시적 형변환 : 개발자가 의도한대로 형을 변환하는 것.
// 메소드를 이용한 형변환 : Integer.parseInt(); 문자열을 정수 타입으로 바꾸는 것.
// double.parseDouble() : 문자열을 실수 타입으로 변경
// 진수 표현 : 16진수, 10진수, 8진수, 2진수
public class TypeEx1 {
    public static void main(String[] args) {
//        int num1 = 1, num2 = 4;
//        double rst1 = num1 / num2; // 문제가 발생하는 코드
//        double rst2 = (double)num1 / num2; // 명시적 형변환과 묵시적 형변환이 일어남.
//        double rst3 = 100 + 100.1;
//
//        System.out.println(rst1);
//        System.out.println(rst2);
//        System.out.println(rst3);
//
//        String phoneNumber = "01091553194";
//        String rootNumber = "3.141592";
//        String name = "곰돌이사육사";
//
//        int number = Integer.parseInt(phoneNumber);
//        System.out.println(number);
//
//        double root = Double.parseDouble(rootNumber);
//        System.out.println(root);

        int var1 = 0b1010; // 2진법 = 10
        int var2 = 0267; // 8진법
        int var3 = 399; // 10진법
        int var4 = 0xacdef; // 16진법

        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);
        System.out.println("var3 : " + var3);
        System.out.println("var4 : " + var4);


    }
}
