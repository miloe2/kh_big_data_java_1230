package 문자열반전;

import java.util.Arrays;
import java.util.Scanner;

// abcdefg -> gfedcba
// 힌트  :  for 문을 이용
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("영문자를 입력해주세요 : ");
        String str = sc.next();
        int index = str.length();
        while (true) {
            index--;
            System.out.print(str.charAt(index));
            if (index == 0) break;

        }

//        for(int i = str.length() - 1; i>= 0; i--){
//            System.out.print(str.charAt(i));
//        }
    }
}

