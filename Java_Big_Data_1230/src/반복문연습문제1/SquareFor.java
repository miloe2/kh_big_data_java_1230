package 반복문연습문제1;
import java.util.Scanner;
// 양의 정수 n을 입력받아서 n * n 크기의 행렬을 출력하는 프로그램 작성
// 입력 : 4
// 1   2   3   4
// 5   6   7   8
// 9  10  11  12
//13  14  15  16
public class SquareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력해주세요 : ");
        int number =  sc.nextInt();
        for(int i = 1; i <= number * number; i++){
            System.out.printf("%4d",i);
                if(i % number == 0){
                    System.out.println();
                }
        }

    }
}
