package 함수형프로그램예제1번;
// 함수형 프로그램 : 수학공식과 유사, 불변성의 원칙, 조건문, 반복문 사용 금지 등의 특징을 가짐.
// 람다(Lambda) : 화살표 포현식으로 사용. 생략가능한 모든 것을 생략하는 것을 기본 원칙.
// 함수형 인터페이스 : 자바는 함수가 독립적으로 존재 할 수 없으므로, 함수형 인터페이스가 필요.
@FunctionalInterface
interface Calculator {
    int sum(int a, int b);
}
@FunctionalInterface
interface MyFuncInterface{
    void method(int x);
}
@FunctionalInterface
interface MyfuncInterface2 {
    int min (int x, int y); // 반환타입이 있는 형태
}

public class FunctionEx1 {
    public static void main(String[] args) {
/*
        Calculator mc = (a, b) -> a + b;
        int rst = mc.sum(2,4);
        System.out.println(rst);
*/

/*

        MyFuncInterface fi = x -> {
            int result = x * 5;
            System.out.println(result);
        };
        fi.method(2);
*/
        MyfuncInterface2 fi = (x,y) -> x < y ? x : y;
        System.out.println(fi.min(3,4));

    }
}