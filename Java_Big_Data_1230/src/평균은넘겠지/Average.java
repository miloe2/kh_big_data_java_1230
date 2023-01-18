package 평균은넘겠지;
//5
//        5 50 50 70 80 100
//        7 100 95 90 80 70 60 50
//        3 70 90 80
//        3 70 90 81
//        9 100 99 98 97 96 95 94 93 91

import java.util.Scanner;

public class Average {
    public static double main(String[] args) {

        // 학생 수를 입력받고, 입력받은 학생 수 만큼의 성적을 입력받음.
        // 평균을 구하기 위해서 먼저 총점을 구하고 이를 나누어 평균을 구함
        // 구해서 평균을 가지고 각각의 입력받은 성적을 비교해 평균을 넘는 학생을 구함
        // 구해진
//        static double overRate() {

            System.out.print("학생 수를 입력하세요 : ");
            Scanner sc = new Scanner(System.in);
            int testCnt = sc.nextInt(); // 학생수 입력
            int[] arr = new int[testCnt]; // 학생 수만큼 성적을 입력받기 위한 배열 생성

            int sum = 0; // 총점을 구하기 위한 변수
            int cnt = 0; // 평균을 넘는 학생수를 구하는 변수


            System.out.print("성적을 입력하세요 : ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt(); // 학생 수만큼 성적을 입력받아 배열을 대입
                sum += arr[i]; // 학생 수만큼 입력된 성적을 누적해서 총점


            }
            double aver = (double) sum / testCnt;
//            if (aver > arr[i]) cnt++;
            for (int e : arr) {
                if (e > aver) cnt++;
            }
            return (double) cnt / testCnt * 100;

//
//            System.out.println(cnt);
////        System.out.println(sum);
////            System.out.println(aver);
//                System.out.println(sum / testCnt);

        }
    }
