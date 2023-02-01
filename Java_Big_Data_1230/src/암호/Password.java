package 암호;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        // 암호화 키의 반복

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String pw = sc.nextLine();
        char[] arrPw = pw.toCharArray();

        char value = 0; //  암호문을 만들기 위한 문자 변수
        List<Character> vig = new ArrayList<>();

//        System.out.println(Arrays.toString(arrText));

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') vig.add(' ');
            else {
                value = (char) (text.charAt(i) - (arrPw[i % pw.length()] - 'a') - 1);
                if (value < 'a') value += 26;
                vig.add(value);
            }
        }
        for (Character e : vig) System.out.print(e);

//
//        for (int i = 0; i < 8; i++) {
//            int x = (arrText[i] - 'a' + 1) + arrPw[i];
//            System.out.print(x + " ");


//        System.out.print((arrText[i] - 'a' + 1) + arrPw[i]);
        }

//        for (char c : arrText){
//            System.out.print(c);
//        }




}
