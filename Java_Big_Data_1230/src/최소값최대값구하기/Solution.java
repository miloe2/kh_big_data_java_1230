package 최소값최대값구하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("배열 개수 입력 : ");
        int arrNum = sc.nextInt();
        int[] arr = new int[arrNum];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt(); //
        }
        int min = arr[0];
        int max = arr[0];

        for(int e : arr){
            if (min > e) min = e;
            if (max < e) max = e;
        }

        System.out.println("최소값 : "+ min);
        System.out.println("최대값 : "+ max);

    }
}