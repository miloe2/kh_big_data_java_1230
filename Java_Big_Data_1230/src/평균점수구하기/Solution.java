package 평균점수구하기;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 : ");
        int[] score = new int[5];
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            score[i] = sc.nextInt();
            if (score[i] < 40) score[i] = 40;
            total += score[i];

        }
        System.out.println(total/5);


    }
}

