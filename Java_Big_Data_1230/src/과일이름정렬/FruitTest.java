package 과일이름정렬;
// 임의의 과일 이름 10개의 배열 생성
// 길이 순으로 정렬하고 길이가 같은 경우 사전 (알파벳 순서)순으로 정렬하기
// String length() : 길이가 길면 양수 (1, -1)
// String compareTo()  : 길이가 같으면 0, 양수가 나오면 정렬 조건, 음수가 나오면 현상태 유지
// Arrays.sort(배열이름, new Comparator<String>(){ compare() 메소드 구현 }
// banana apple grape kiwi pineapple strawberry peach mango orange lemon

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class FruitTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] fruitArr = new String[10];
        System.out.print("과일 이름 입력 : ");
        for(int i = 0; i < 10; i++) {
            fruitArr[i] = sc.next();
        }
        Arrays.sort(fruitArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) return 1; //  첫번째가 두번째 보다 길이가 길면 정렬 조건
                else {
                    if (o1.length() == o2.length()) {
                        return o1.compareTo(o2); // 두번째가 순서상 앞에 있으면 양수 값.
                    }
                    return -1; // 현 상태 유지
                }
            }
        });
        for(String e : fruitArr) System.out.print(e+" ");

    }
}
