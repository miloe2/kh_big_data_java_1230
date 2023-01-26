package Date클래스;
import java.text.SimpleDateFormat;
import java.util.Date;
// Date() : 1970년 1월 1일 0시 0분 0초에서 현재까지의 경과시간으로 계산 (msec), 객체 생성 후 사용
// SimpleDateFormat : 운영체제로부터 얻은 시간 정보를 우리가 원하는 포맷으로 변경해서 출력함(pattern
public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        // yyyy : 연도를 4자리로 표현 (2023)
        // yy: 연도를 2자리로 표현 (23)
        // MM : 월을 2자리로 표시 (01) / 반드시 대문자
        // hh : 12시간제를 의미
        // HH : 24시간제를 의미
        // mm : 분을 표시 (2자리)
        // W : 월에서 몇번째 주
        // w : 년에서 몇 주차 (23주차)

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        String dateStr = sdf.format(now);
//        System.out.println(dateStr);
        SimpleDateFormat f1, f2, f3, f4, f5, f6, f7;
        f1 = new SimpleDateFormat("yyyy-MM-dd"  );
        f2 = new SimpleDateFormat("yy-MM-dd"  );
        f3 = new SimpleDateFormat("yyyy년 M월 d일"  );
        f4 = new SimpleDateFormat("HH:mm:ss");
        f5 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"  );
        f6 = new SimpleDateFormat("오늘은 M월의 W번째 주, d번째 날입니다. "  );
        f7 = new SimpleDateFormat("오늘은 yyyy년 w주차입니다." );

        System.out.println(f1.format(now));
        System.out.println(f2.format(now));
        System.out.println(f3.format(now));
        System.out.println(f4.format(now));
        System.out.println(f5.format(now));
        System.out.println(f6.format(now));
        System.out.println(f7.format(now));

    }
}
