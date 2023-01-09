package 상근날드;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] menu = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("가격 입력 : ");
        for(int i = 0; i < menu.length; i++){
            menu[i] = sc.nextInt();
        }
        int minBurger = menu[0];
        int minDrink = menu[3];
        // 반복문을 순회하면서 햄버거 1개와 음료 1개를 선택 (가장 저렴 한 것)
        for (int i = 0; i < menu.length; i++){
            if ((i < 3) && (minBurger > menu[i])) minBurger = menu[i];
            if ((i < 2) && (minDrink > menu[i])) minDrink = menu[i];
        }
    }

}
