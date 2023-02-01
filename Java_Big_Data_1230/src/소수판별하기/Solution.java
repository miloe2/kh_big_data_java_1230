package 소수판별하기;
// 소수 판별하기, 소수의 합 구하기
// 메소드 호출 시 정수 값을 입력하여 해당 정수가 소수이면 그 값을 반환
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        int sum = 0;
        // 반복문 수행 : 입력받은 정수 미만의 값을 메소드 호출
        for(int i = 2; i < number; i++) {
            sum += primeSum(i);
        }
        System.out.println("소수의 합은 : " +sum);

    }
    static int primeSum (int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }
}


