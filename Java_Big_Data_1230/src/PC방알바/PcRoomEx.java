package PC방알바;
import TV만들기.TVMain;
import java.util.Arrays;
import java.util.Scanner;

// PC방에 PC가 100대 있음 (배열의 인덱스 0 ~ 99),
// 손님들은 모두 자기가 앉고 싶어하는 자리가 있음.
// 만약 자기가 앉고 싶어하는 자리에 다른 손님이 있으면 거절 해야하고, 아니면 자리를 사용 허가
// 손님의 수 입력 : 3
// 손님이 앉고 싶어하는 자리 번호 입력 : 1 3 5 => 0 (거절 횟수)
// 손님의 수 입력 : 5
// 자리번호 : 1 1 3 3 5
// 거절 횟수 출력 : 2
public class PcRoomEx {
    public static void main(String[] args) {
        // PC방 좌석에 대한 100개의 배열이 필요
        // 배열의 초기값은 0. -> 0이면 비어있는 자리이다.
        Scanner sc = new Scanner(System.in);

        int[] pc = new int[100];
        int cnt = 0; // 거절 횟수
        int seatNum; // 손님이 원하는 좌석 번호를 입력받기 위한 변수

        int clientNumber = sc.nextInt(); // 손님의 수를 입력 받음


        for(int i = 0; i < clientNumber; i++){
            seatNum = sc.nextInt(); // 좌석번호는 1번 부터 시작
            if(pc[seatNum - 1] != 0) { // 해당 배열의 값이 1이라는 건 이미 사용하고 있는 자리이다.
                cnt++;
            } else {
                pc[seatNum - 1] = 1; // 비어있는 자리를 사용함.
            }
        }
        System.out.println(cnt);
    }
}
