package 시간입력;

import java.util.Arrays;
import java.util.Scanner;

// 입력 : 23:5:3 (24시간제로 시간을 콜론(:) 기준으로 입력
// 출력 : 오후 11시 05분 03초
public class TimeSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] result = time.split(":");
//        System.out.println(Arrays.toString(result));
        int hour = Integer.parseInt(result[0]);
        int min = Integer.parseInt(result[1]);
        int sec = Integer.parseInt(result[2]);

//        System.out.println(hour);

        if (hour < 0 || hour > 23) System.out.println("시간을 다시 입력해주세요");
        else if (hour < 12) {
            System.out.printf("오전 %02d시 %02d분 %02d초", hour, min, sec);
        } else System.out.printf("오후 %02d시 %02d분 %02d초", (hour - 12), min, sec);

    }
}
