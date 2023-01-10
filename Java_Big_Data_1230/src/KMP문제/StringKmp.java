package KMP문제;

import java.util.Arrays;
import java.util.Scanner;

/*
KMP 알고리즘이 KMP인 이유는 이를 만든 사람의 성이 Knuth, Morris, Prett이기 때문이다. 이렇게 알고리즘에는 발견한 사람의 성을 따서 이름을 붙이는 경우가 많다.
또 다른 예로, 유명한 비대칭 암호화 알고리즘 RSA는 이를 만든 사람의 이름이 Rivest, Shamir, Adleman이다.
사람들은 이렇게 사람 성이 들어간 알고리즘을 두 가지 형태로 부른다.

- 첫 번째는 성을 모두 쓰고, 이를 하이픈(-)으로 이어 붙인 것이다. 예를 들면, Knuth-Morris-Pratt이다. 이것을 긴 형태라고 부른다.
- 두 번째로 짧은 형태는 만든 사람의 성의 첫 글자만 따서 부르는 것이다. 예를 들면, KMP이다.

동혁이는 매일매일 자신이 한 일을 모두 메모장에 적어놓는다. 잠을 자기 전에, 오늘 하루 무엇을 했는지 되새겨 보는 것으로 하루를 마감한다.
하루는 이 메모를 보던 중, 지금까지 긴 형태와 짧은 형태를 섞어서 적어 놓은것을 발견했다.
이렇게 긴 형태로 하루 일을 기록하다가는 메모장 가격이 부담되어 파산될 것이 뻔하기 때문에, 앞으로는 짧은 형태로 기록하려고 한다.
긴 형태의 알고리즘 이름이 주어졌을 때, 이를 짧은 형태로 바꾸어 출력하는 프로그램을 작성하시오.
 */
public class StringKmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
//         첫번째 방법 : split()
        String[] splitName = name.split("-");

        for (int i = 0; i < name.length(); i++) {
        } System.out.println(splitName[0].charAt(0));

////        for(String e : splitName) System.out.println(e.charAt(0));

////        두번째 방법 : 대문자만 골라내기
        for(int i = 0; i < name.length(); i++){
            if(name.charAt(i) >= 'A' && name.charAt(i) <= 'Z'){ // 대문자 구간
                System.out.print(name.charAt(i));

            }
        }

//        세번재 방법 : 0번재 문자 출력, 그리고 '-' 다음 문자 출력
        for(int i = 0; i <name.length(); i++){
            if(i == 0) System.out.print(name.charAt(i));
            else {
                if(name.charAt(i) == '-') System.out.print(name.charAt(i+1));
            }
        }

//        네번째 방법 : 문자 배열로 변경 후 대문자 골라내기
        char[] chName = name.toCharArray();
        for(char e : chName) {
            if (e >= 'A' && e <= 'Z') System.out.println(e);
        }




    }
}
