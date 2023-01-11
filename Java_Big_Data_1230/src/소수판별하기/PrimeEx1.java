package 소수판별하기;
// 소수 : 1과 자기 자신 이외에 나눠지지 않는 수
// 소수 판별하기 :

import java.util.Scanner;

public class PrimeEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력 : ");
        int number = sc.nextInt();
        boolean isPrime = false;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = true;
            }
            break;
        }
        if (isPrime) {
            System.out.println(number + "은(는) 소수가 아닙니다.");
        } else {    System.out.println(number + "은(는) 소수 입니다.");
    }



//            boolean rst = isPrime(number);
//            System.out.println("소수여부 : " + rst);
//
//        }
//        static boolean isPrime ( int n){
//            return true;

            }
        }

