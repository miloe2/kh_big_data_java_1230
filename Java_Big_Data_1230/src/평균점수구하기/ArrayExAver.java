package 평균점수구하기;

import java.util.Arrays;
import java.util.Scanner;

// 상현이가 가르치는 학생은 총 5명 (유진, 유나, 채원, 카즈하, 원영)
// 성적이 40점 미만인 경우 보충학습을 듣는 조건으로 40점으로 성적을 조정해줌
// 모든 학생이 보충학습을 들음
// 총 수강생의 평균을 구하는 프로그램 작성
// 점수는 모두 0점 이상, 100점 이하, 5의 배수
public class ArrayExAver {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        // 5명의 성적을 저장하기 위한 배열 생성
        // 성적 입력 받으면서, 40점 미만이면 40점으로 올려줌.
        // 평균을 구하기 위해서 성적을 모두 합산함.
        //

        Scanner sc = new Scanner(System.in);
        System.out.println("점수 입력 : ");
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            int sum = 0;
            if (arr[i] < 40) {
                arr[i] = 40;
            }

            for(int e : arr)
                sum += arr[i];

        }
        System.out.println(Arrays.toString(arr));


    }
}
