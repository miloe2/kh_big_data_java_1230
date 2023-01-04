package 제일큰값찾기;

import java.util.Scanner;

// 세자리의 정수를 입력받아 100자리, 10자리, 1의 자리로 나누어 담고 이중 가장 큰 수 찾기
public class MaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 정수 입력 받기위한 스캐너 객체 생성
        System.out.print("세자리 정수를 입력하세요 : ");

        int number = sc.nextInt(); // 키보드로 입력받은 값을 변수에 담음

        int a = number / 100;
        int b = (number % 100) / 10;
        int c = number % 10;

        if (a > b){
            if (a > c) System.out.println(a);
            else System.out.println(c);
        } else {
            if (b > c) System.out.println(b);
            else System.out.println(c);
        }


    }
}
