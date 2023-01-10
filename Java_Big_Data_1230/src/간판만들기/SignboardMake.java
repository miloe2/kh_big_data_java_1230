package 간판만들기;

import java.util.Scanner;

// 각 숫자마다 차지하는 공간이 다름
// 0은 4칸, 1은 2칸, 나머지는 3칸을 차지
// 간판의 숫자 사이는 1칸 여백 필요
// 총 입력한 숫자를 표기하기 위해 몇 칸이 필요한지
// 0이 입력될때까지 계속 반복 입력 가능 (종료조건)
public class SignboardMake {
    public static void main(String[] args) {
        int[] numberSize = {4,2,3,3,3,3,3,3,3,3};
        Scanner sc = new Scanner(System.in);
        String signNumber ; // 문자열 입력 받는 변수
        int sum = 0; // 총 몇 자리의 공간을 차지하는지 누적하는 변수
        while(true){
            signNumber = sc.next();
            if (signNumber.equals('0')) break;
            for(int i = 0; i < signNumber.length(); i++){
                sum += numberSize[signNumber.charAt(i)-'0'] + 1;
            }
            System.out.println(sum + 1);
            sum = 0;
        }
    }
}
