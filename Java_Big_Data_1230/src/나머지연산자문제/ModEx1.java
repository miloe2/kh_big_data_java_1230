package 나머지연산자문제;
import java.util.Scanner;
// 100의 자리 정수를 입력받아서 3개의 변수(100자리/10자리/1자리)에 대입하기
// 365
// a = 3, b = 6, c = 5,

public class ModEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력해주세요 : ");
        int num = sc.nextInt();
        int a, b, c;
        a = num / 100; // 100으로 나눈 몫을 취한다.
        b = num % 10;



        System.out.println(a);
        System.out.println(b);


    }
}
