package 진수변환;
import java.util.Scanner;
//- 주어진 문제
//10진수가 주어지면 2진수로 변경하고 이를 다시 2진수로 변경 합니다.
//단, 배열을 사용하지 않고 변경 합니다.

//입력 : 10
//이진수 : 1010
//십진수 : 10
public class ChangeBinary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("십진수 입력 : ");
        int num = sc.nextInt();
        int cnt = 0;
        int temp = 0;
        int binary = 0;

        while (true) {
            if (num / 2 == 0 && num % 2 == 0) {
                break;
            } else {
                if (num % 2 == 1) {   // 2를 나눠 1이면
                    temp = ((int) Math.pow(10, cnt)) ; // temp 값은 10의 cnt 승 ex) 10^0 = 1, 10^2=100
                } else if (num % 2 == 0) {
                    temp = 0 ;
                }
                cnt++;
                num = num / 2;
            } binary = binary + temp;
        }
        System.out.println("이진수 : "+ binary);
        String strInt = Integer.toString(binary);

        int sum = 0;
        for(int i = 0; i < strInt.length(); i++){
            if (strInt.charAt(i) != 0) { // 2진수의 i번째 값이 0이 아니면,
                int square = (int)((int) Math.pow(2, strInt.length() - i - 1)); // 2의 strInt.length() - i - 1승 * 1
                sum = square * (strInt.charAt(i) -'0') + sum;
            }
        }
        System.out.println("십진수 : " + sum);
    }
}