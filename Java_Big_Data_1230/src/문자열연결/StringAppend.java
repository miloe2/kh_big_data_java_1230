package 문자열연결;
import java.util.Scanner;
// 문자열 추가하기
// 첫번째 문자열 입력 : seoul
// 두번재 문자열 입력 : korea
// 정수값 입력 : 2
// 첫번째 문자열에서 입력받은 정수 개수만큼 문자를 뒤에서 부터 잘라, 두번재 문자열 앞에 추가하기
// ulkorea
// 3 입력 -> oulkorea
// 힌트 1 : substring(index) : 문자열의 시작 위치 부터 끝까지
// 힌트 2 : substring 메소드를 이용하여 문자열 추출 전 index 계산이 필요함.
public class StringAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        int number = sc.nextInt();

        int index = first.length() - number;
                System.out.println(first.substring(index) + second);
    }
}
