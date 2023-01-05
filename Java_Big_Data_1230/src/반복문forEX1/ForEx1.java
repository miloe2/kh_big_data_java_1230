package 반복문forEX1;

import java.util.Scanner;

// for 반복문 : for (초기식; 조건식; 증감식){ 반복 수행 구간 }
public class ForEx1 {
    public static void main(String[] args) {
//        for(int i = 1; i <= 100; i++){
//            System.out.printf("%4d", i);
//            if ( i % 10 == 0) System.out.println();
//        }

//        int i = 1;
//        while(true) {
//            System.out.printf("%4d", i);
//            if (i % 10 == 0) System.out.println();
//            if (i == 100) break;
//            i++;
//        }

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        int sum = 0;
//        while(num > 0) {
//            sum += num; // sum = sum + num;
//            num--;
//        }
//        System.out.println("정수의 합은 : " + sum);

        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.println("정수의 합은 : " + sum);

    }
}