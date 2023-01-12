package 홀수짝수나누어담기;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// 7개 정수를 입력 받음 (배열 생성)
// 정수 입력 : 1 2 3 4 5 6 7
// 홀수 : 1 3 5 7
// 짝수 : 2 4 6
public class OddEvenSeparate {
    List<Integer> inList = new ArrayList<>();
    List<Integer> oddList = new ArrayList<>();
    List<Integer> evenList = new ArrayList<>();
    void inputArray (){
        Scanner sc = new Scanner(System.in);
        int value = 0;
        while(true){
            value = sc.nextInt();
            if (value == 999) break;
            inList.add(value); // ArrayList 값을 추가 함
        }
    }
    void separatorArray (){
        for(int e : inList){
            if(e % 2 == 0) evenList.add(e);
            else oddList.add(e);
        }
    }
    void printArray(){
        System.out.print("홀수 : ");
        for(int e : oddList) System.out.print(e + " ");
        System.out.println();
        System.out.print("짝수 : ");
        for(int e : evenList) System.out.print(e + " ");
    }

}


