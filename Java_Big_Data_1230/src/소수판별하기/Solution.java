package 소수판별하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean rst = isPrime(number);
        System.out.println("소수여부 : " + rst);

    }
    static boolean isPrime ( int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

