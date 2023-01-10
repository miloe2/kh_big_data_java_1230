package 메소드연습;

import java.util.Scanner;

// 메소드 이름 규칙은 : 변수 만든는 규칙과 동일 (대/소문자,_, $, 숫자 사용 가능)
// camel 표기법 사용
// 접근제한자, 반환타입, 메소드이름(매개변수목록) {구현부 ; return;}
public class ClassMethod {
    public static void main(String[] args) {
        Sample sample = new Sample();//클래스내에 생성자가 없으면 기본생성자가 호출됨.
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 입력 : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int rst = sample.sum(n1, n2); //
                System.out.println(rst);
        sample.say();
        System.out.println(sample.sayStr());

    }
}
