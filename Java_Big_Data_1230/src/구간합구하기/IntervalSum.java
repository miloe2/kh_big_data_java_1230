package 구간합구하기;

import java.util.Scanner;

public class IntervalSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();
        int testCase = sc.nextInt();
        int[] arr = new int[number];
        int totalSum = 0;

        for (int i = 0; i < number; i++){
            arr[i] = sc.nextInt();
            totalSum += arr[i];
        }
        for(int i = 0; i < testCase; i++) {
            int fstSum = 0;
            int lstSum = 0;
            int fstIndex = sc.nextInt();
            int lstIndex = sc.nextInt();
            for(int j = 0; j < fstIndex - 1; j++){
                fstSum += arr[j];
            }
            for(int k = lstIndex; k < number; k++){
                lstSum += arr[k];
            }

            System.out.println(totalSum - fstSum - lstSum);
        }
    }
}
