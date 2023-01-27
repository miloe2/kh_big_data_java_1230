package System클래스;

import static java.lang.Thread.sleep;

public class SystemTest {
    public static void main(String[] args) throws InterruptedException {
        int[]data = new int [1000];
        int cnt = 0;
        int val = (int)(Math.random()*1000) + 1; // 1 ~ 1000 사이의 임의의 값
        for (int i = 0 ; i<data.length; i++){ // 1000개의 배열에 1부터 1000까지의 값을 저장
            data[i] = i + 1;
        }
        long time1 = System.currentTimeMillis();  // 측정을 위한 시작 시간 가져옴
        for(int i = 0; i < data.length; i++){
            cnt++;
            sleep(1);    // 시간 측정에 대해서 지연 요인을 만들기 위해서
            if (val == data [i]){
//                System.out.println("위치 : " + (i+1));
                break;
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println("총 검색 횟수: " + cnt );
        System.out.println("검색에 소요된 시간 : " + (time2 - time1));
    }
}
