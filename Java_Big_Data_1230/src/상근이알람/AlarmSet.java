package 상근이알람;

import java.util.Scanner;

// 상근이는 매일 학교를 지각. 창영이는 상근이에게 지각하지 않는 방법을 알려줌.
// 시간을 설정하면 자동으로 45분 일찍 알람이 울리도록 설정됨.
// 24시간제
public class AlarmSet {
    public static void main(String[] args) {
        // 시간을 입력 받기 위해 스캐너 객체 생성
        // 생성된 객체로 시간과 분을 입력 받음 (24시간제)
        // 변수를 만들어서 입력받은 시간과 분을 모두 분으로 환산
        // 고려사항 : 환산한 시간이 45분보다 적으면 별도의 계산
        // 창영이가 알려준 방법대로 시간을 45분 이전으로 돌림 (45를 뺌)
        // 계산 결과를 시간과 분으로 출력하기 위해 다시 변환 후 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("시간을 입력해주세요 : ");

        int time = sc.nextInt();
        if (time < 45) {
            System.out.println("알람 설정 시간은 23시 "+(15 + time) + "분입니다.");
        } else if (45 <= time && time <= 2400) {
            int hour = (time / 100) * 60;
            int min = (time % 100);
            int set = (hour + min) - 45;

            int setHour = set / 60;
            int setMin = set % 60;
            System.out.println("알람 설정 시간은 " + setHour + "시" + setMin + "분입니다.");
        } else {
            System.out.print("올바른 시간을 입력해주세요");
        }
    }
}
