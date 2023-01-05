package 반복문연습문제2;
import java.util.Scanner;
// 입력 : 5
// *
// * *
// * * *
// * * * *
// * * * * *
public class starPoinEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 : ");
        int number = sc.nextInt();

        for(int i = 0; i < number; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
