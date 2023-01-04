package 윤년구하기;
// 4로 나눠지면 윤년 : 4로 나눈 나머지가 0
// 100으로 나누어 떨어지는 연도는 윤년이 아님
// 400으로 나누어 떨어지는 연도는 윤년
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){ // 조건이 참인 구간
            System.out.println(year + "은 윤년입니다.");
        } else{ //조건이 거짓인 구간
            System.out.println(year + "은 윤년이 아닙니다.");
        }

    }
}
