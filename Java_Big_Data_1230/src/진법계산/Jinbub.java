package 진법계산;
//## 문제
//8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.

//## 입력
//첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.

//## 출력
//첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.

//## 예제 입력 1
//314

//## 예제 출력 1
//11001100

import java.util.Arrays;
import java.util.Scanner;

public class Jinbub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int octalToDecimal = Integer.parseInt(num, 8);
        String binary = Integer.toBinaryString(octalToDecimal);
        System.out.println(binary);
    }
}