package 단어공부;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

//## 문제
//알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
//단, 대문자와 소문자를 구분하지 않는다.
//
//## 입력
//첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//## 출력
//첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
// 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
public class WordStudy {
    public static void main(String[] args) {
        int[] alphabet = new int [26]; // 알파벳 개수 만들기

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int max = 0;
        int result = 0;
//
//        for (int i = 0; i < input.length(); i++) {
//            if(input.charAt(i) >= 'a')
//
//



        char[] inputArr = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            inputArr[i] = input.charAt(i);
            for(int j = 0; j <input.length(); j++){

                if (inputArr[i] == inputArr[j])
                    inputArr[i]++;
                }
            }
        for(int i = 0; i < input.length(); i++) {
            if(inputArr[i] == max) result = '?';
            else if (inputArr[i] > max) {
                max = inputArr[i];
                result = (char) (max);
            }

        }
        System.out.println(result);

    }
}
