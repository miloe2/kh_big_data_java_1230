package 상근날드;
// 햄버거 3종류, 음료 2종류
// 입력은 총 5개의 값을 연속으로 입력하는데, 햄버거 3가지, 음료 2가지 연속으로 입력
// 햄버거 3가지 중 가장 싼 메뉴 선택, 음료 2가지 중 가장 싼 메뉴 선택, 50원 할인
// 총 세트 메뉴의 금액은?
import java.util.Scanner;
public class SetMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가격 입력 : ");
        int[] menu = new int[5];
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();
        }
        int burger = 0;
        int drink = 0;

            if (menu[0] < menu[1]) {
                if (menu[0] < menu[2]) burger = menu[0];
                else burger = menu[2];
                } else if (menu[1] < menu[2]) burger = menu[1];
            else burger = menu[2];

            if (menu[3] < menu[4]) drink = menu[3];
            else drink = menu[4];

        System.out.println(burger + drink - 50);
    }
}