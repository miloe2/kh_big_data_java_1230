package 최소값최대값구하기;

import java.util.Arrays;
import java.util.Scanner;

// 정수값 입력
// 입력된 정수 범위의 임의의 값 입력해서 배열 생성
// 해당 배열에서 제일 작은 값과 제일 큰 값 찾기
// 정수값 입력 : 10
// 1 3 5 7 2 4 10 10 20 15
// Min : 1, Max : 20
public class MinMaxArray {
    public static void main(String[] args) {
        // 키보드 입력을 위한 스캐너 생성
        // 정수값 입력을 받음.
        // 입력 받음 정수로 배열을 생성
        // 생성된 배열 크기만큼 순회하면서 정수값을 입력 받음
        // 배열에서 제일 작은 값과 제일 큰 값을 찾음
        // 출력

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int[] array = new int[number];

        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * number);

            int min = array[0];
            int max = array[0];

            for(int e : array){
                if (min > e) min = e;
                if (max < e) max = e;

                System.out.print(min);

            }


        }


    }


}




