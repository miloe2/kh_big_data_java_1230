package 두번째숫자찾기;

import java.util.Scanner;

// 임의의 숫자 10개를 입력받아 중복된 숫자 중 2번째 등장하는 숫자의 위치 찾기 : 1 2 3 4 5 1 2 3 4 5
// 5 ==> 10
// 임의의 수 입력 : 1 2 3 4 5 5 6 7 8 2
// 찾을 수 : 5
// 결과 : 6
// 만약에 2번째 등장하는 수가 없으면 -1출력
public class SecondNum {
    public static void main(String[] args) {
        int i;
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 10개를 입력해주세요. ");
        int[] arrNum = new int[10];
        for (i = 0; i < arrNum.length; i++)
            arrNum[i] = sc.nextInt();

        System.out.println("찾을 숫자를 입력해주세요. ");
        int findNum = sc.nextInt();

        for (i = 0; i < arrNum.length; i++) {
            if (findNum == arrNum[i]) cnt++;
            if (cnt == 2) break;
        } if(cnt == 2) {
            System.out.println(i+1);
        } else {
            System.out.println(-1);
        }
    }
}