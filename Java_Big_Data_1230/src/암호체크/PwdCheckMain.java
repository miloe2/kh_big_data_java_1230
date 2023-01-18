package 암호체크;
// 암호체크
// 암호의 길이는 10 ~ 30자 사이
// 암호에는 숫자, 소문자, 대문자, 특수 문자가 포함되어야 함
// 특수 문자는 (! % _ & + - * /)의 9개중 하나
// 입력받은 패스워드가 조건을 만족하면 "Good Password", 만족하지 않으면 "Bad Password" 출력
// 반복문을 사용하고 사용자가 "종료"또는 "exit"를 입력하면 프로그램 종료

import java.util.ArrayList;
import java.util.Scanner;

public class PwdCheckMain {
    public static void main(String[] args) {
        System.out.println("패스워드를 입력하세요! ");
        PwdCheckClass pwdCheck = new PwdCheckClass();
        Scanner sc = new Scanner(System.in);
        String pwd; // 암호를 입력 받는 변수 생성
        while (true) {
            System.out.print("암호 입력 : ");
            pwd = sc.next();

            if (pwd.equals("종료") || pwd.equalsIgnoreCase("exit")) break;

            if(!pwdCheck.validLength(pwd)){
                System.out.println("Bad Length password");
                continue;
            }
            if(!pwdCheck.validNumber(pwd)){
                System.out.println("Bad Number password");
                continue;
            }
            if(!pwdCheck.validLowerAlphabet(pwd)){
                System.out.println("Bad Lower Alphabet password");
                continue;
            }
            if(!pwdCheck.validUpperAlphabet(pwd)) {
                System.out.println("Bad Upper Alphabet password");
                continue;
            }
            if(!pwdCheck.validRex(pwd)) {
                System.out.println("Bad Upper Alphabet password");
                continue;
            }
            System.out.println("Good Password");
        }
    }
}


