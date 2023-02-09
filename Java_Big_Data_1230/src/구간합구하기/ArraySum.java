package 구간합구하기;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt(); // 배열의 개수
        int testCase = sc.nextInt();
        int[] arr = new int[number];
        long[] sumArr = new long [number]; //
        for(int i = 0; i < number; i++) {
            arr[i]   = sc.nextInt() ;
            if (i == 0) sumArr[0] = arr[0];
            else sumArr[i] = sumArr[i-1]+ arr[i];
        }
        int left = 0, right = 0;
        while(testCase != 0){
            left = sc.nextInt();
            right =sc.nextInt();
            // 구간합 계산하기 : sum[R] - sum[L-1}, 인데스로 계산하기 위해서는 -1을 더해준다. 시간의 복잡도는 : O(1)
            if (left != 1) System.out.println(sumArr[right - 1] - sumArr[left - 2]);
            else System.out.println(sumArr[right - 1]);
            testCase--;
            }
        }
    }

