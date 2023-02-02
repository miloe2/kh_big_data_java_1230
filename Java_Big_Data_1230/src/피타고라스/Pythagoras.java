package 피타고라스;
//### 문제
//과거 이집트인들은 각 변들의 길이가 3, 4, 5인 삼각형이 직각 삼각형인것을 알아냈다.
//주어진 세변의 길이로 삼각형이 직각인지 아닌지 구분하시오.

//### 입력
//입력은 여러개의 테스트케이스로 주어지며 마지막줄에는 0 0 0이 입력된다.
//각 테스트케이스는 모두 30,000보다 작은 양의 정수로 주어지며, 각 입력은 변의 길이를 의미한다.
//세변의 길이의 입력 순서는 정해져 있지 않다.

//### 출력
//각 입력에 대해 직각 삼각형이 맞다면 "right", 아니라면 "wrong"을 출력한다.

//### 예제 입력
//6 8 10
//25 52 60
//5 12 13
//0 0 0

//### 예제 출력
//right
//wrong
//right

import java.util.Arrays;
import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            int[] input = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
            Arrays.sort(input);
            if (input[0] == 0 && input[1] == 0 && input[2] == 0 ){
                break;
            } else  {
                int powA = (int) Math.pow(input[0], 2);
                int powB = (int) Math.pow(input[1], 2);
                int powC = (int) Math.pow(input[2], 2);

                if (powC == powA + powB) {
                    System.out.println("right");
                } else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
