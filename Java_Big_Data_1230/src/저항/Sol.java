package 저항;

import java.util.Scanner;

// 전자 제품에는 저항이 들어간다.
// 저항은 색 3개를 이용해서 그 저항이 몇 옴인지 나타낸다.
// 처음 색 2개는 저항의 값이고, 마지막 색은 곱해야 하는 값이다.
// 저항의 값은 다음 표를 이용해서 구한다.
public class Sol {
    public static void main(String[] args) {
        int temp1 = 0;
        int temp2 = 0;
        int temp3 = 0;
        Scanner sc = new Scanner(System.in);

        String[] color = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        int[] multi = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 100000000};

        System.out.print("첫번째 색상을 입력해주세요 : ");
        String colorStr1 = sc.next();
        System.out.print("두번째 색상을 입력해주세요 : ");
        String colorStr2 = sc.next();
        System.out.print("세번째 색상을 입력해주세요 : ");
        String colorStr3 = sc.next();

        for (int i = 0; i < color.length; i++) {
            if (colorStr1.equalsIgnoreCase(color[i])) {
                temp1 = i;
            }
        }
        for (int j = 0; j < color.length; j++){
            if (colorStr2.equalsIgnoreCase(color[j])){
                temp2 = j;
            }
        }
        for (int x = 0; x < color.length; x++){
            if (colorStr3.equalsIgnoreCase(color[x])){
                temp3 = x;
            }
        }

        System.out.println(((temp1 * 10) + temp2) * (long)(multi[temp3]));
    }
}
