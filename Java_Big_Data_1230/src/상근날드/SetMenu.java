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
        int burger = 0;
        for (int i = 0; i < menu.length; i++) {
            menu[i] = sc.nextInt();

            if (menu[1] < menu[2]){
               if (menu[1] < menu[3]) burger = menu[1];
               else { burger = menu[2];
            else{

            }
        }

    }
}
