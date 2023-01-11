package 영화표예매;
import java.util.Arrays;
import java.util.Scanner;
// 현재 좌석 상태를 보여주는 메소드 필요
// 좌석을 예매하는 메소드 필요
// 판매된 좌석의 개수를 구해 총 판매 금액을 구하는 메소드 필요
public class MovieTicket {
    int[] seat = new int[10];

    // 극장의 좌석 상태를 표시하는 배열 만들기 (총 10개)
    // 현재 좌석 상태를 보여주는 메소드 작성
    // 0 이면 [  ] , 1이면 [ V ]

    void printSeat() {
        for (int i = 0; i < seat.length; i++) {
            if (seat[i] == 0) System.out.print("[  ]");
            else System.out.print("[ V ]");
        }
        System.out.println();
    }
    // 좌석을 예약하는 메소드
    void selectSeat(){
        printSeat();
        Scanner sc = new Scanner(System.in);
        System.out.print("좌석번호를 입력하세요 : ");
        int seatSel = sc.nextInt(); // 좌석번호는 1번 부터 시작

            if(seat[seatSel - 1] == 0) { // 해당 배열의 값이 1이라는 건 이미 사용하고 있는 자리이다.
//                System.out.println("이미 예약된 자리입니다.");
                seat[seatSel - 1] = 1; // 좌석판매
                printSeat(); // 좌석 판매 후 갱신된 정보 호출
            } else{
                    System.out.println("예약이 완료되었습니다.");

                }
            }

        // printSeat() 호출해서 현재 좌석 상태 보여 줌
        // 좌석번호를 입력 받아 예약하는데 이미 예약된 좌석은 에러 문구 출력하고 재입력 요구
        // 좌석 예약이 성공하면 printSeat()를 호출해 좌석 상태 보여줌.

    int totalAmount(){
        int cnt = 0;
        for(int i = 0; i <seat.length; i++){
            if(seat[i] == 1) {
                cnt++;
            }
        } return cnt * 12000;
        // 좌석 예약 정보를 가지고 있는 배열을 순회해 예약된 좌석 개수를 누적
        // 좌석 개수와 좌석 당 가격 금액을 곱하여 결과값 반환
    }

    public void getMovieTicket(){
        System.out.println("====== 좌석 정보 ======");
        printSeat();

    }


}
