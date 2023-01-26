package Calender클래스;

import java.util.Calendar;

// Calendar 클래스는 추상 클래스이므로 객체생성없이 사용, 날짜와 시간과 달리 캘린더 표기법은 각 나라마다 상이하기 때문
// 정적메소드인 getInstance() 메소드를 이용해서 운영체제의 시간 기준의 정보를 가져옴
public class CalendarEx {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.print(now.get(Calendar.YEAR));
        System.out.print(now.get(Calendar.MONTH) + 1);
        System.out.print(now.get(Calendar.DAY_OF_WEEK));
        System.out.print(now.get(Calendar.DAY_OF_MONTH));
        System.out.print(now.get(Calendar.AM_PM));
        System.out.print(now.get(Calendar.HOUR));
        System.out.print(now.get(Calendar.MINUTE));
        System.out.print(now.get(Calendar.SECOND));

        int year = now.get(Calendar.YEAR);
        int mon = now.get(Calendar.MONTH);
        int day = now.get(Calendar.DAY_OF_MONTH);
        int isPM = now.get(Calendar.AM_PM);
        int hour = now.get(Calendar.HOUR);
        int min = now.get(Calendar.MINUTE);
        int sec = now.get(Calendar.SECOND);
        if(isPM == 1) hour += 12;
        System.out.printf("%d년%d월%일 %d시%d분%d초\n", year, mon, day, hour,min,sec);



    }
}
